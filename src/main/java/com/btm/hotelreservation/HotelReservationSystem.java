package com.btm.hotelreservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class HotelReservationSystem {

	List<HotelDetails> hotelDetails = new ArrayList<>();
	Map<String, Integer> map = new HashMap<>();

	public ArrayList<String> findCheapestHotel(String checkIn, String checkOut) {
		LocalDate checkInDate = convertStringToDate(checkIn);
		LocalDate checkOutDate = convertStringToDate(checkOut);
		addDetail("Lakewood", 110, 90, 3, 80, 80);
		addDetail("Bridgewood", 150, 50, 4, 110, 60);
		addDetail("Ridgewood", 220, 150, 5, 100, 40);
		ArrayList<String> cheapestHotelNameList = new ArrayList<>();

		int minRate = Integer.MAX_VALUE;
		for (HotelDetails hotelDetail : hotelDetails) {
			LocalDate startDay = checkInDate;
			LocalDate endDay = checkOutDate.plusDays(1);
			int hotelRent = 0;
			while (!(startDay.equals(endDay))) {
				int day = startDay.getDayOfWeek().getValue();
				if (day == 6 || day == 7) {
					hotelRent = hotelRent + hotelDetail.getWeekendDays();
				} else {
					hotelRent = hotelRent + hotelDetail.getWeekDays();
				}
				startDay = startDay.plusDays(1);
			}
			if (hotelRent <= minRate) {
				minRate = hotelRent;
				cheapestHotelNameList.add(hotelDetail.getName());
				map.put(hotelDetail.getName(), hotelDetail.getRate());
			}
		}
		return cheapestHotelNameList;
	}

	public String cheapestRated(String checkIn, String checkOut) {
		findCheapestHotel(checkIn, checkOut);
		Map.Entry<String, Integer> cheapestBestRatedHotel = null;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (cheapestBestRatedHotel == null || entry.getValue().compareTo(cheapestBestRatedHotel.getValue()) > 0) {
				cheapestBestRatedHotel = entry;
			}
		}
		return cheapestBestRatedHotel.getKey();
	}

	public String findCheapestRatedForRegularCustomer(String checkIn, String checkOut) {
		LocalDate checkInDate = convertStringToDate(checkIn);
		LocalDate checkOutDate = convertStringToDate(checkOut);
		addDetail("Lakewood", 110, 90, 3, 80, 80);
		addDetail("Bridgewood", 150, 50, 4, 110, 60);
		addDetail("Ridgewood", 220, 150, 5, 100, 40);
		ArrayList<String> cheapestHotelNameList = new ArrayList<>();

		int minRate = Integer.MAX_VALUE;
		int bestRating = 0;
		HotelDetails BestRatedHotel = null;
		for (HotelDetails hotelDetail : hotelDetails) {
			LocalDate startDay = checkInDate;
			LocalDate endDay = checkOutDate.plusDays(1);
			int hotelRent = 0;
			while (!(startDay.equals(endDay))) {
				int day = startDay.getDayOfWeek().getValue();
				if (day == 6 || day == 7) {
					hotelRent = hotelRent + hotelDetail.getWeekendDays();
				} else {
					hotelRent = hotelRent + hotelDetail.getWeekDays();
				}
				startDay = startDay.plusDays(1);
			}
			if (hotelDetail.getRate() > bestRating) {
				bestRating = hotelDetail.getRate();
				BestRatedHotel = hotelDetail;
			}
		}
		return BestRatedHotel.getName();
	}

	public ArrayList<String> findCheapestHotelForRewardee(String checkIn, String checkOut) {
		LocalDate checkInDate = convertStringToDate(checkIn);
		LocalDate checkOutDate = convertStringToDate(checkOut);
		addDetail("Lakewood", 110, 90, 3, 80, 80);
		addDetail("Bridgewood", 150, 50, 4, 110, 60);
		addDetail("Ridgewood", 220, 150, 5, 100, 40);
		ArrayList<String> cheapestHotelName = new ArrayList<>();

		int minRate = Integer.MAX_VALUE;
		for (HotelDetails hotelDetail : hotelDetails) {
			LocalDate startDay = checkInDate;
			LocalDate endDay = checkOutDate.plusDays(1);
			int hotelRent = 0;
			while (!(startDay.equals(endDay))) {
				int day = startDay.getDayOfWeek().getValue();
				if (day == 6 || day == 7) {
					hotelRent = hotelRent + hotelDetail.getRewardeeWeekendDays();
				} else {
					hotelRent = hotelRent + hotelDetail.getRewardeeWeekDays();
				}
				startDay = startDay.plusDays(1);
			}
			if (hotelRent <= minRate) {
				minRate = hotelRent;
				cheapestHotelName.add(hotelDetail.getName());
				map.put(hotelDetail.getName(), hotelDetail.getRate());
			}
		}
		return cheapestHotelName;
	}

	public String cheapestRatedForRewardCustomer(String checkIn, String checkOut) {
		findCheapestHotelForRewardee(checkIn, checkOut);
		Map.Entry<String, Integer> cheapestBestRatedHotel = null;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (cheapestBestRatedHotel == null || entry.getValue().compareTo(cheapestBestRatedHotel.getValue()) > 0) {
				cheapestBestRatedHotel = entry;
			}
		}
		return cheapestBestRatedHotel.getKey();
	}
	
	public ArrayList<String> bestHotelForRegularCustomer(String checkIn, String checkOut, boolean regular) {
		LocalDate checkInDate = convertStringToDate(checkIn);
		LocalDate checkOutDate = convertStringToDate(checkOut);
		addDetail("Lakewood", 110, 90, 3, 80, 80);
		addDetail("Bridgewood", 150, 50, 4, 110, 60);
		addDetail("Ridgewood", 220, 150, 5, 100, 40);
		ArrayList<String> cheapestHotelName = new ArrayList<>();
		int minRate = Integer.MAX_VALUE;
		for (HotelDetails hotelDetail : hotelDetails) {
			LocalDate startDay = checkInDate;
			LocalDate endDay = checkOutDate.plusDays(1);
			int hotelRent = 0;
			while (!(startDay.equals(endDay))) {
				int day = startDay.getDayOfWeek().getValue();
				if (day == 6 || day == 7) {
					hotelRent = hotelRent + hotelDetail.getWeekendDays();
				} else {
					hotelRent = hotelRent + hotelDetail.getWeekDays();
				}
				startDay = startDay.plusDays(1);
			}
			if (hotelRent <= minRate) {
				minRate = hotelRent;
				cheapestHotelName.add(hotelDetail.getName());
				map.put(hotelDetail.getName(), hotelDetail.getRate());
			}
		}
		System.out.println("Hotel_Name : " + cheapestHotelName);
		return cheapestHotelName;
	}
	
	public String cheapestBestRatedHotelForRegularCustomer(String checkIn, String checkOut, boolean regular) {
		bestHotelForRegularCustomer(checkIn, checkOut, regular);
		Map.Entry<String, Integer> cheapestBestRatedHotel = null;
		@SuppressWarnings("null")
		HotelDetails bestRatedHotel = ((Collection<HotelDetails>) cheapestBestRatedHotel).stream()
				.max(Comparator.comparing(HotelDetails::getRate)).get();
		String cheapestHotel = bestRatedHotel.getName();
		int bestRating = bestRatedHotel.getRate();
		System.out.println("Hotel_Name : " + cheapestHotel);
		return cheapestHotel;
	}

	public void addDetail(String hotelName, int weekDayRate, int weekendRate, int rating, int weekDayRateRewardeeCust,
			int weekendRateRewardeeCust) {
		HotelDetails hotelDetail = new HotelDetails(hotelName, weekDayRate, weekendRate, rating,
				weekDayRateRewardeeCust, weekendRateRewardeeCust);
		hotelDetails.add(hotelDetail);
	}

	public LocalDate convertStringToDate(String dateString) {
		LocalDate date = null;
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("ddMMMyyyy");
		try {
			date = LocalDate.parse(dateString, dateTimeFormat);
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static void main(String[] args) throws InvalidEntriesException {
		HotelReservationSystem obj = new HotelReservationSystem();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter checkIn Date : ");
		String checkIn = sc.nextLine();
		System.out.println("Enter checkOut Date : ");
		String checkOut = sc.nextLine();
		System.out.println("true/false");
		boolean regular = sc.nextBoolean();
		System.out.println(
				"Enter choice \n1.FindCheapestHotelForRegularCustomer \n2.FindBestRatedHotelForRegularCustomer \n3.Exit ");
		int entry = sc.nextInt();
			switch (entry) {
			case 1:
				obj.bestHotelForRegularCustomer(checkIn, checkOut, regular);
				break;
			case 2:
				obj.cheapestBestRatedHotelForRegularCustomer(checkIn, checkOut, regular);
				break;
			default:
				throw new InvalidEntriesException("Invalid entry");
			}
	}
}