package Booking;
import Extras.*;
import Flight.*;
import Interfaces.*;

import java.lang.*;
import java.io.*;
import java.util.*;

public class CancelFlight extends FlightInformation
{

    private static int  serialNo;
    private String flightName;
    private String nid;

    public CancelFlight()
	{

    }

    public CancelFlight(String flightName, String nid) {
        this.flightName=flightName;
        this.nid=nid;
    }

    public void setFlightName (String flight)
    {
        this.flightName=flightName;
    }

    public void setNid (String nid)
    {
        this.nid=nid;
    }

    public String getFlightName()
    {
        return flightName;
    }

    public String getNid()
    {
        return nid;
    }
	
	/*public void showCancelFlight()
	{
		System.out.println("We Are Very Sorry To Say.");
		System.out.print("For Some Reason This Feature Isn't Available Right Now.");
        System.out.print("In Next Update This Feature Willbe Workable Properly.\n\n");
		System.out.println("Thank You For Your Great Patience.");
	}*/
}