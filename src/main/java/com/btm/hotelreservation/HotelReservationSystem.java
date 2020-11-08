package com.btm.hotelreservation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HotelReservationSystem {

	public String findCheapestHotel(String checkIn, String checkOut) throws ParseException {

		Date checkInDate = convertStringToDate(checkIn);
		Date checkOutDate = convertStringToDate(checkOut);
		long duration = checkOutDate.getTime() - checkInDate.getTime();
		int days = (int) TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);

		List<HotelDetails> hotelDetails = new ArrayList<>();
		hotelDetails.add(new HotelDetails("Lakewood", 110));
		hotelDetails.add(new HotelDetails("Bridgewood", 150));
		hotelDetails.add(new HotelDetails("Ridgewood", 220));

		for (int hotel = 0; hotel < hotelDetails.size(); hotel++) {
			int newRate = hotelDetails.get(hotel).getRegularRate() * (days + 1);
			hotelDetails.get(hotel).setRegularRate(newRate);
		}
		String hotelName = hotelDetails.stream().min(Comparator.comparing(HotelDetails::getRegularRate)).get()
				.getName();
		int regularRate = hotelDetails.stream().min(Comparator.comparing(HotelDetails::getRegularRate)).get()
				.getRegularRate();
		return hotelName + ", $" + regularRate;
	}

	public Date convertStringToDate(String dateString) throws ParseException {
		Date date = null;
		DateFormat df = new SimpleDateFormat("ddMMMyyyy");
		date = df.parse(dateString);
		return date;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");
	}
}
