package com.qa.javaday6.inheritance;

public class Car extends Vehicle {

	public Car() {
		super();
	}

	private boolean metallicPaint;
	private int noOfDoors;
	private String fuelType;

	public Car(String colour, int tyreSize, String manufacturer, boolean metallicPaint, int noOfDoors,
			String fuelType) {
		super(4, colour, tyreSize, manufacturer);
		this.metallicPaint = metallicPaint;
		this.noOfDoors = noOfDoors;
		this.fuelType = fuelType;
	}

	@Override
	public void move() {
		System.out.println("Vroom vroooom");
	}

	public boolean getMetallicPaint() {
		return metallicPaint;
	}

	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;

	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

};