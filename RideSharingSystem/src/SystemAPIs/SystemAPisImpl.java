package SystemAPIs;

import CachingManager.CachingManagerClass;
import Pojos.User;
import Pojos.Vehicle;
import Pojos.VehicleStatus;

public class SystemAPisImpl implements SystemApis{

	@Override
	public void addUserDetail(User user) {
		// TODO Auto-generated method stub
		CachingManagerClass.addUser(user);
		
	}

	@Override
	public void addVehcileDetail(Vehicle vehicle) {
		// TODO Auto-generated method stub
		CachingManagerClass.addVehicles(new VehicleStatus(vehicle,false));
		
	}

}
