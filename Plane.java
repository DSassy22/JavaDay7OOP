package com.qa.javaday6.inheritance;

public class Plane extends Vehicle {

	public Plane() {
		super();

	}

	private int noOfCabins;
	private int engineSize;
	private int maxRpm;

	public Plane(String colour, int tyreSize, String manufacturer, int noOfCabins, int engineSize, int maxRpm) {
		super(6, colour, tyreSize, manufacturer);
		this.engineSize = engineSize;
		this.maxRpm = maxRpm;
		this.noOfCabins = noOfCabins;
	}

	@Override
	public void move() {
		System.out.println("GRRRRRRRRRR");
	}

	public int getNoOfCabins() {
		return noOfCabins;
	}

	public void setNoOfCabins(int noOfCabins) {
		this.noOfCabins = noOfCabins;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getMaxRpm() {
		return maxRpm;
	}

	public void setMaxRpm(int maxRpm) {
		this.maxRpm = maxRpm;
	}

}
