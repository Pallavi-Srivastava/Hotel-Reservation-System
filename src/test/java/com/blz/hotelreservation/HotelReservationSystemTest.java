package com.blz.hotelreservation;

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
	public void findCheapestRatedHotelForRegularCustomer() {
		String res = obj.findCheapestRatedForRegularCustomer("11Sep2020", "12Sep2020");
		Assert.assertEquals("Ridgewood", res);
	}

	@Test
	public void findCheapestRatedHotelForRewardCustomer() {
		String res = obj.cheapestRatedForRewardCustomer("11Sep2020", "12Sep2020");
		Assert.assertEquals("Ridgewood", res);
	}
}
