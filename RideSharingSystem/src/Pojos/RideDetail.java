package Pojos;

public class RideDetail {
	String userName;
	String origin;
	String destination;
	String vehicle;
	int seats;
	public RideDetail(String userName, String origin, String destination, String vehicle, int seats) {
		this.userName = userName;
		this.origin = origin;
		this.destination = destination;
		this.vehicle = vehicle;
		this.seats = seats;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}

}
