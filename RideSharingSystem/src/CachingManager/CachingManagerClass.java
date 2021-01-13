package CachingManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import Pojos.RideDetail;
import Pojos.User;
import Pojos.VehicleStatus;

public class CachingManagerClass {
	
	static ConcurrentHashMap<String,User>users=new ConcurrentHashMap<>();
	static ConcurrentHashMap<String,ConcurrentHashMap<String,VehicleStatus>>vehicles=new ConcurrentHashMap<>();
	static ConcurrentHashMap<String,List<RideDetail>>rideMap=new ConcurrentHashMap<>();
	
	public static ConcurrentHashMap<String,User> getUsers() {
		return users;
	}
	
	public static ConcurrentHashMap<String, List<RideDetail>> getRideMap() {
		return rideMap;
	}

	public static void setRideMap(ConcurrentHashMap<String, List<RideDetail>> rideMap) {
		CachingManagerClass.rideMap = rideMap;
	}

	public static void addUser(User user) {
		users.put(user.getName(),user);
	}
	public static ConcurrentHashMap<String, ConcurrentHashMap<String,VehicleStatus>> getVehicles() {
		return vehicles;
	}
	public static void addVehicles(VehicleStatus vehicleStatus) {
		ConcurrentHashMap<String,VehicleStatus>innerHashMap=new ConcurrentHashMap<String, VehicleStatus>();
		innerHashMap.put(vehicleStatus.getVehicle().getModel(),vehicleStatus);
		vehicles.put(vehicleStatus.getVehicle().getUserName(),innerHashMap);
	}

}
