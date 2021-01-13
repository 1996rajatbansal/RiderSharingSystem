package Pojos;

public class User {
	
	public User(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	String name;
	String gender;
	int age;
	int offeredRides=0;
	int consumedRides=0;
	public int getOfferedRides() {
		return offeredRides;
	}
	public void incrementOffereRides() {
		this.offeredRides++;
	}
	public int getConsumedRides() {
		return consumedRides;
	}
	public void incrementConsumedRides() {
		this.consumedRides++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
