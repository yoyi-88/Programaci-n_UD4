package ejercicio17_9;

public final class Car extends Vehicle implements Maintenance{ 
	private int numberOfDoors;
	
	@Override
	public double maxSpeed() {
		return 220.00;
	}
	
	@Override
	public String nextMaintenanceDate() {
		int maintenanceDate = super.getYear() + 5;
		return "Proximo mantenimiento: " + maintenanceDate;
	}
	
	public Car(String licensePlate, String brand, int year, FuelType fuelType, int numberOfDoors) {
		super(licensePlate, brand, year, fuelType);
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "Car getLicensePlate()=" + getLicensePlate() + ", getBrand()=" + getBrand() + 
				", getYear()=" + getYear() + ", getFuelType()=" + getFuelType();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Car car = (Car) obj;
		if (super.equals(car) && this.numberOfDoors == car.numberOfDoors);
			return true;
	}
	
	public void setNumberOfDoors (int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public int getNumberOfDoors () {
		return numberOfDoors;
	}
}
