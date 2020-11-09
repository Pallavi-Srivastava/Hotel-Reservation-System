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
	public void inGivenHotelsFindTheCheapestRatedOne() throws ParseException {
		String res = obj.cheapestRated("11Sep2020", "12Sep2020");
		Assert.assertEquals("Bridgewood", res);
	}
}
