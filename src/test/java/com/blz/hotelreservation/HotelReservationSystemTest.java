package com.blz.hotelreservation;

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
	public void givenHotelsFindTheCheapestOne() throws ParseException {
		Object[] resultHotelName = obj.findCheapestHotel("11Sep2020", "12Sep2020").toArray();
		Object[] expectedHotelName = { "Lakewood", "Bridgewood" };
		Assert.assertArrayEquals(expectedHotelName, resultHotelName);
	}
}
