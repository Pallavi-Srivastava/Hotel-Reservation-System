package com.blz.hotelreservation;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Assert;
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
	public void addHotelDetailsInHotelReservationSystem() throws ParseException {
		// obj.addHotelDetails();
		String result = obj.findCheapestHotel("10sep2020", "11sep2020");
		Assert.assertEquals("Lakewood, $220", result);
	}
}
