package DriverPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Pojos.SelectionStrategyChoices;
import SystemAPIs.SystemAPisImpl;
import UserAPIs.UserApiImpl;

public class DriverClass {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DriverMethods driver=new DriverMethods();
		String choice;
		System.out.println("        This is Ride Sharing app...................");
		System.out.println("################################################################");
		while(true)
		{
			System.out.println("1:Onboard User..");
			System.out.println("2:Onboard vehicle.");
			System.out.println("3:Offer Ride.");
			System.out.println("4:Select Ride");
			System.out.println("5:Print Ride Status");
			System.out.println("6:Exit");
			choice=br.readLine();
			switch(choice)
			{
			case "1":
				/*
				 * String user=br.readLine(); String gender=br.readLine(); int
				 * age=Integer.parseInt(br.readLine());
				 */
				driver.addUserDetails("rohit", "M", 12);
				driver.addUserDetails("reena", "M", 12);
				break;
			case "2":
				/*String model=br.readLine();
				String number=br.readLine();
				String userName=br.readLine();*/
				driver.addVehicleDetails("activa", "1234", "rohit");
				break;
			case "3":
				/*
				 * userName=br.readLine(); String src=br.readLine(); String des=br.readLine();
				 * String vehicle=br.readLine(); int seats=Integer.parseInt(br.readLine());
				 */
				driver.offerRide("rohit", "banglore", "mumbai", "activa", 1);
				break;
			case "4":
				/*
				 * userName=br.readLine(); src=br.readLine(); des=br.readLine();
				 * vehicle=br.readLine(); seats=Integer.parseInt(br.readLine());
				 * vehicle=br.readLine(); choice=br.readLine();
				 */
			/*	if(choice.equals("1"))
				{*/
					driver.selectRide("reena", "banglore","mumbai" , SelectionStrategyChoices.MOST_VACANT_SEATS, 1, "");	
				/*
				 * } else { driver.selectRide(userName, src, des,
				 * SelectionStrategyChoices.PREFERED_VEHICLE, seats, vehicle); }
				 */
				
				break;
			case "5":
				driver.printStats();
				break;
			case "6":
				System.exit(1);
				break;
				
			}
			
		}
		
		
	}

}
