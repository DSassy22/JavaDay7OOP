package com.qa.javaday6.inheritance;

public class Runner {

	public static void main(String[] args) {

		Car c1 = new Car("blue", 16, "BMW", true, 5, "petrol");
		Car c2 = new Car("red", 14, "audi", false, 3, "diesel");

		System.out.println(c1);
		System.out.println(c2);
		c1.move();
		c2.move();
		System.out.println();

		Plane p1 = new Plane("white", 69, "airbus", 1, 5, 2000);
		Plane p2 = new Plane("white and blue", 80, "boeing", 3, 10, 5000);

		System.out.println(p1);
		System.out.println(p2);
		p1.move();
		System.out.println();

		Ship s1 = new Ship("black", "mitsubishi", true, 3);
		Ship s2 = new Ship("cream", "hyundai", false, 1);

		System.out.println(s1);
		System.out.println(s2);
		s1.move();
		System.out.println();

		Garage manager = new Garage();

		manager.addVehicle(c1);
		manager.addVehicle(c2);
		manager.addVehicle(p1);
		manager.addVehicle(p2);
		manager.addVehicle(s1);
		manager.addVehicle(s2);

		manager.addByType(s2);
		manager.addByType(c1);
		manager.printList();

//		manager.calculateByType();
//		
//		manager.addByType(s2);

	}

}
