package com.qa.javaday6.inheritance;

public class Ship extends Vehicle {

	public Ship() {
		super();
	}

	public Ship(String colour, String manufacturer, boolean isCruiseShip, int noOfFloors) {
		super(8, colour, 0, manufacturer);
		this.isCruiseShip = isCruiseShip;
		this.noOfFloors = noOfFloors;
	}

	@Override
	public void move() {
		System.out.println("flubber blubber");
	}

	private boolean isCruiseShip;
	private int noOfFloors;

	public boolean isCruiseShip() {
		return isCruiseShip;
	}

	public void setCruiseShip(boolean isCruiseShip) {
		this.isCruiseShip = isCruiseShip;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

}
