package Pojos;

public class RequestRide {
	
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
	public int getSeats() {
		return seats;
	}
	public RequestRide(String origin, String destination, int seats, SelectionStrategy selectionStrategy) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.seats = seats;
		this.selectionStrategy = selectionStrategy;
	}
	public RequestRide(String origin, String destination, int seats, SelectionStrategy selectionStrategy,
			String userName) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.seats = seats;
		this.selectionStrategy = selectionStrategy;
		this.userName = userName;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public SelectionStrategy getSelectionStrategy() {
		return selectionStrategy;
	}
	public void setSelectionStrategy(SelectionStrategy selectionStrategy) {
		this.selectionStrategy = selectionStrategy;
	}
	String origin;
	String destination;
	int seats;
	SelectionStrategy selectionStrategy;
	String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
