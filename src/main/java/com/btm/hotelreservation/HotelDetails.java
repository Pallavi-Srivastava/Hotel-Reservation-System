package com.btm.hotelreservation;

public class HotelDetails {

	private String name;
	private int weekDays;
	private int weekendDays;
	private int rate;
	private int rewardeeWeekDays;
	private int rewardeeWeekendDays;

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

	public int getRewardeeWeekDays() {
		return rewardeeWeekDays;
	}

	public void setRewardeeWeekDays(int rewardeeWeekDays) {
		this.rewardeeWeekDays = rewardeeWeekDays;
	}

	public int getRewardeeWeekendDays() {
		return rewardeeWeekendDays;
	}

	public void setRewardeeWeekendDays(int rewardeeWeekendDays) {
		this.rewardeeWeekendDays = rewardeeWeekendDays;
	}

	public HotelDetails(String name, int weekDays, int weekendDays, int rate, int rewardeeWeekDays,
			int rewardeeWeekendDays) {
		super();
		this.name = name;
		this.weekDays = weekDays;
		this.weekendDays = weekendDays;
		this.rate = rate;
		this.rewardeeWeekDays = rewardeeWeekDays;
		this.rewardeeWeekendDays = rewardeeWeekendDays;
	}

	@Override
	public String toString() {
		return "HotelDetails [name=" + name + ", weekDays=" + weekDays + ", weekendDays=" + weekendDays + ", rate="
				+ rate + ", rewardeeWeekDays=" + rewardeeWeekDays + ", rewardeeWeekendDays=" + rewardeeWeekendDays
				+ "]";
	}
}
