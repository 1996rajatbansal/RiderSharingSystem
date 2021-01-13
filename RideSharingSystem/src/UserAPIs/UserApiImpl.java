package UserAPIs;

import java.util.ArrayList;
import java.util.Iterator;

import CachingManager.CachingManagerClass;
import Pojos.RideDetail;
import Pojos.SelectionStrategy;
import Pojos.SelectionStrategyChoices;


public class UserApiImpl implements UserApis{

	String key;
	ArrayList<RideDetail>ridArrayList;
	RideDetail obj;
	int count;
	@Override
	public void offerRide(RideDetail rideDetail) {
		if(CachingManagerClass.getVehicles().containsKey(rideDetail.getUserName())&&CachingManagerClass.getVehicles().get(rideDetail.getUserName()).containsKey(rideDetail.getVehicle())&&CachingManagerClass.getVehicles().get(rideDetail.getUserName()).get(rideDetail.getVehicle()).isOfferedStatus())
		{
			System.out.println("Can't offered Ride..Because User Already Offered A ride");
		}
		else
		{
			CachingManagerClass.getVehicles().get(rideDetail.getUserName()).get(rideDetail.getVehicle()).setOfferedStatus(true);
			key=rideDetail.getOrigin()+"_"+rideDetail.getDestination();
			if(CachingManagerClass.getRideMap().containsKey(key))
			{
				CachingManagerClass.getRideMap().get(key).add(rideDetail);
			}
			else
			{
				System.out.println("Key:"+key);
				ridArrayList=new ArrayList<RideDetail>();
				ridArrayList.add(rideDetail);
				CachingManagerClass.getRideMap().put(key,ridArrayList);	
			}
			
		}
		  CachingManagerClass.getUsers().get(rideDetail.getUserName()).incrementOffereRides();
		
	}

	@Override
	public void RequestRide(Pojos.RequestRide requestRide) {
		// TODO Auto-generated method stub
		key=requestRide.getOrigin()+"_"+requestRide.getDestination();
		System.out.println("Key:"+key);
		if(requestRide.getSelectionStrategy().getSelectionStrategyChoices()==SelectionStrategyChoices.MOST_VACANT_SEATS)
		{
		        ridArrayList=(ArrayList<RideDetail>) CachingManagerClass.getRideMap().get(key);
		        if(ridArrayList!=null&&ridArrayList.size()==0)
		        {
		        	System.out.println("Sorry No ride available for this Route...");
		        }
		        count=Integer.MIN_VALUE;
		        for(int i=0;i<ridArrayList.size();i++)
		        {
		        	if(ridArrayList.get(i).getSeats()>count)
		        	{
		        		obj=ridArrayList.get(i);
		        	}
		        }
		      
		        
		}
		else
		{
		    for(int i=0;i<ridArrayList.size();i++)
	        {
	        	if(ridArrayList.get(i).getVehicle().contains(requestRide.getSelectionStrategy().getVehicleName()))
	        			{
	        		
	        		obj=ridArrayList.get(i);
	        		break;
	        			}
	        }
		}
		
		  CachingManagerClass.getUsers().get(requestRide.getUserName()).incrementConsumedRides();
		
	}

	@Override
	public void printRideStats() {
		// TODO Auto-generated method stub
		
		String user;
		Iterator<String>itr=CachingManagerClass.getUsers().keySet().iterator();
		while(itr.hasNext())
		{
			user=itr.next();
			System.out.println(user+" offered:"+ CachingManagerClass.getUsers().get(user).getOfferedRides()+" consumed:"+CachingManagerClass.getUsers().get(user).getConsumedRides());
		}
		
		
		
	}

}
