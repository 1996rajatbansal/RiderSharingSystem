package DriverPackage;

import Pojos.RequestRide;
import Pojos.RideDetail;
import Pojos.SelectionStrategy;
import Pojos.SelectionStrategyChoices;
import Pojos.User;
import Pojos.Vehicle;
import SystemAPIs.SystemAPisImpl;
import UserAPIs.UserApiImpl;

public class DriverMethods {
	
	SystemAPisImpl systemAPisImpl=new SystemAPisImpl();
	UserApiImpl userImpl=new UserApiImpl();
	public void addUserDetails(String user,String gender,int age){
		systemAPisImpl.addUserDetail(new User(user,gender,age));
		
	}
	public void addVehicleDetails(String model,String number,String userName){
		systemAPisImpl.addVehcileDetail(new Vehicle(userName,model,number));
	}
	
	public void offerRide(String userName,String src,String des,String vehicle,int seats)
	{
		userImpl.offerRide(new RideDetail(userName, src, des, vehicle, seats));
		
	}
	
	public void selectRide(String userName,String src,String des,SelectionStrategyChoices choice,int seats,String vehicleName)
	{
		userImpl.RequestRide(new RequestRide(src, des,seats,new SelectionStrategy(choice, vehicleName),userName));
	}
	public void printStats()
	{
		userImpl.printRideStats();
	}

}
