package com.blz.hotelreservation;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import com.btm.hotelreservation.HotelReservationSystem;

public class HotelReservationSystemTest {

	private static HotelReservationSystem obj;

	@BeforeClass
	public static void createHotelReservationSystemObj() {
		obj = new HotelReservationSystem();
		System.out.println("Welcome to this section : ");
	}

	@Test
	public void addHotelDetailsInHotelReservationSystem() {
		obj.addHotelDetails();
	}
}
