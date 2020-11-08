package com.btm.hotelreservation;

import java.util.*;

public class HotelReservationSystem {

	public void addRatesForAllDays() {
		List<HotelDetails> hotelDetails = new ArrayList<>();
		hotelDetails.add(new HotelDetails("Lakewood", 110, 90));
		hotelDetails.add(new HotelDetails("Bridgewood", 150, 50));
		hotelDetails.add(new HotelDetails("Ridgewood", 220, 150));
		System.out.println(hotelDetails);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");
	}
}
