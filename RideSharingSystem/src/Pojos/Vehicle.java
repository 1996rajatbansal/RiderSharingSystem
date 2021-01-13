package Pojos;

public class Vehicle {

	public Vehicle(String userName, String model, String number) {
		super();
		this.userName = userName;
		this.model = model;
		this.number = number;
	}
	String userName;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	String model;
	String number;

}
