package Pojos;

public class VehicleStatus {
	
	public VehicleStatus(Vehicle vehicle, boolean offeredStatus) {
		this.vehicle = vehicle;
		this.offeredStatus = offeredStatus;
	}
	Vehicle vehicle;
	boolean offeredStatus=false;
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public boolean isOfferedStatus() {
		return offeredStatus;
	}
	public void setOfferedStatus(boolean offeredStatus) {
		this.offeredStatus = offeredStatus;
	}

}
