package com.qa.javaday6.inheritance;

public class Vehicle {

	public Vehicle() {
		super();
	}

	private int noOfWheels;
	private String colour;
	private int tyreSize;
	private String manufacturer;

	public Vehicle(int noOfWheels, String colour, int tyreSize, String manufacturer) {
		super();
		this.noOfWheels = noOfWheels;
		this.colour = colour;
		this.tyreSize = tyreSize;
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Vehicle [noOfWheels=" + noOfWheels + ", colour=" + colour + ", tyreSize=" + tyreSize + ", manufacturer="
				+ manufacturer + "]";
	}

	public void move() {
		System.out.println("I'm moving!");
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getTyreSize() {
		return tyreSize;
	}

	public void setTyreSize(int tyreSize) {
		this.tyreSize = tyreSize;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
