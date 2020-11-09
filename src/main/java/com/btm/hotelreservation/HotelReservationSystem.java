package com.btm.hotelreservation;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {

	List<HotelDetails> hotelDetails = new ArrayList<>();

	public ArrayList<String> findCheapestHotel(String checkIn, String checkOut) throws ParseException {

		LocalDate checkInDate = convertStringToDate(checkIn);
		LocalDate checkOutDate = convertStringToDate(checkOut);

		hotelDetails.add(new HotelDetails("Lakewood", 110, 90));
		hotelDetails.add(new HotelDetails("Bridgewood", 150, 50));
		hotelDetails.add(new HotelDetails("Ridgewood", 220, 150));
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
			}
		}
		return cheapestHotelNameList;
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

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");
	}
}
