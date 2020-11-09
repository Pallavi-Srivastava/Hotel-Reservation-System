package com.btm.hotelreservation;

public class HotelDetails {

	private String name;
	private int weekDays;
	private int weekendDays;
	private int rate;

	@Override
	public String toString() {
		return "HotelDetails [name=" + name + ", weekDays=" + weekDays + ", weekendDays=" + weekendDays + ", rate="
				+ rate + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeekDays() {
		return weekDays;
	}

	public void setWeekDays(int weekDays) {
		this.weekDays = weekDays;
	}

	public int getWeekendDays() {
		return weekendDays;
	}

	public void setWeekendDays(int weekendDays) {
		this.weekendDays = weekendDays;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public HotelDetails(String name, int weekDays, int weekendDays, int rate) {
		super();
		this.name = name;
		this.weekDays = weekDays;
		this.weekendDays = weekendDays;
		this.rate = rate;
	}
}
