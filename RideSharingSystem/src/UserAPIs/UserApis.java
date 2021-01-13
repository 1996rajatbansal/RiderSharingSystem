package UserAPIs;

import Pojos.RequestRide;
import Pojos.RideDetail;

public interface UserApis {
	
	void offerRide(RideDetail rideDetail);
	void RequestRide(RequestRide requestRide);
	void printRideStats();

}
