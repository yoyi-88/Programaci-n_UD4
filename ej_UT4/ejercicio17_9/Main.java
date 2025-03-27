package ejercicio17_9;

import ejercicio17_9.Vehicle.FuelType;

public class Main {
	public static void main(String[] args) {
		
		Vehicle coche = new Car("7788 XYZ", "Toyota", 2022, FuelType.ELECTRIC, 4);
		Vehicle moto = new Motorcycle("4455 GHI", "Yamaha", 2023, FuelType.GASOLINE, true);
		
		System.out.println(Vehicle.vehicleCount);
	}
}
