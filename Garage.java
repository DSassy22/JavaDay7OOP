package com.qa.javaday6.inheritance;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		vehicles.add(v);

	}

	public void addByType(Vehicle v) {
		if (v instanceof Car) {
			vehicles.add(v);
		}
	}

	public void removeVehicle(Vehicle v) {
		this.vehicles.remove(v);

	}

	public void printList() {
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}

	public void calculateByType() {
		int sum = 0;
		for (Vehicle x : vehicles) {
			if (x instanceof Ship) {
				sum += ((Ship) x).getNoOfFloors();
			} else if (x instanceof Car) {
				sum += ((Car) x).getNoOfDoors();
			} else if (x instanceof Plane) {
				sum += ((Plane) x).getNoOfCabins();
			}
			System.out.println(x);
			System.out.println(sum);
		}

	}

	public static void main(String[] args) {
		// System.out.println(vehicles);
	}

}
