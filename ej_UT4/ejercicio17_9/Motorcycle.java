package ejercicio17_9;

public class Motorcycle extends Vehicle implements Maintenance{
	private boolean hasSidecar;
	
	@Override
	public double maxSpeed() {
		return 250.00;
	}

	@Override
	public String nextMaintenanceDate() {
		int maintenanceDate = super.getYear() + 5;
		return "Próximo mantenimiento: " + maintenanceDate;
	}
	
	public Motorcycle(String licensePlate, String brand, int year, FuelType fuelType, boolean hasSidecar) {
		super(licensePlate, brand, year, fuelType);
		this.hasSidecar = hasSidecar;
	}

	@Override
	public String toString() {
		return "Motorcycle [getLicensePlate()=" + getLicensePlate() + 
				", getBrand()=" + getBrand() + ", getYear()="+ getYear() + 
				", getFuelType()=" + getFuelType();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Motorcycle moto = (Motorcycle) obj;
		if (super.equals(moto) && this.hasSidecar == moto.hasSidecar);
		return true;
	}
	
	public void setHasSidecar (boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}
	public boolean getHasSidecar () {
		return hasSidecar;
	}
}
