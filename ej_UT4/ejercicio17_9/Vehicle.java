package ejercicio17_9;

public abstract class Vehicle {
	protected String licensePlate;
	protected String brand;
	protected int year;
	protected static int vehicleCount;
	
	enum FuelType {
		GASOLINE, DIESEL, ELECTRIC, HYBRID
	}
	private FuelType fuelType; 
	
	public abstract double maxSpeed ();
	
	public Vehicle (String licensePlate, String brand, int year, FuelType fuelType) {
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.year = year;
		this.fuelType = fuelType;
		vehicleCount ++;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Vehicle licensePlate=" + licensePlate + ", brand=" + brand + 
				", year=" + year + ", fuelType=" + fuelType;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		Vehicle vehiculo = (Vehicle) obj;
		if (this.brand.equals(vehiculo.brand) && this.licensePlate.equals(vehiculo.licensePlate)
				&& this.year == vehiculo.year && this.fuelType == vehiculo.fuelType);
			return true;
	}
}
