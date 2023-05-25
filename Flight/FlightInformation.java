package Flight;
import Booking.*;

import java.lang.*;
import java.io.*;
import java.util.*;

public class FlightInformation
{
    public static int serialNo;
    public String flightName;
    public String from;
    public String departureTime;
    public String transit;
    public String to;
    public double fair;

    public FlightInformation()
    {

    }

    public FlightInformation(String flightName,String from,String departureTime,String transit,String to,double fair)
    {
        this.flightName = flightName;
        this.from = from;
        this.departureTime = departureTime;
        this.transit = transit;
        this.to = to;
        this.fair = fair;
    }

    public FlightInformation(String from, String to, String departureTime) {
    }

    public void setSerialNo(int serialNo)
    {
        this.serialNo = serialNo;
    }

    public void setFlightName(String flightName)
    {
        this.flightName = flightName;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public void setDepartureTime(String departureTime)
    {
        this.departureTime = departureTime;
    }

    public void setTransit(String transit)
    {
        this.transit = transit;
    }

    public void setTo(String to)
    {
        this.to = to;
    }

    public void setFair(double fair)
    {
        this.fair = fair;
    }

    public int getSerialNo()
    {
        return serialNo;
    }

    public String getFlightName()
    {
        return flightName;
    }

    public String getFrom()
    {
        return from;
    }

    public String getDepartureTime()
    {
        return departureTime;
    }

    public String getTransit()
    {
        return transit;
    }

    public String getTo()
    {
        return to;
    }

    public double getFair()
    {
        return fair;
    }

    public void showFlightInfo(){
    	System.out.println("*********************************************************************************************************************************************************");
		System.out.println("*********************************************************************| Flight Information |**************************************************************");
		System.out.println("*********************************************************************************************************************************************************");
		System.out.println("*****************************************************************| Domestic Flight Information |*********************************************************");
		System.out.println("*********************************************************************************************************************************************************");
		System.out.println("******|  #SQ No.  |******|     Flight Name     |******|   From    |******| DepartureTime |******| Transit |******|       To       |******|  Fair  |******");
		System.out.println("*********************************************************************************************************************************************************");
		System.out.println("******| FN-470399 |******| Bangladesh Airlines |******| Dhaka(BD) |******|     10:15     |******|    No   |******| Chittagong(BD) |******| $82.35 |******");
		System.out.println("******| B-45-ABCD |******|  US-Bangla Airlines |******| Dhaka(BD) |******|     13:30     |******|    No   |******|   Khulna(BD)   |******| $80.40 |******");
		System.out.println("******| UN-309644 |******|    Regent Airways   |******| Dhaka(BD) |******|     15:00     |******|    No   |******|  Barishal(BD)  |******| $60.95 |******");
		System.out.println("******| UB-004455 |******|        Novoair      |******| Dhaka(BD) |******|     09:45     |******|    No   |******|  Rajshahi(BD)  |******| $60.95 |******");
		System.out.println("******| GN-470399 |******|   Dragon Airlines   |******| Dhaka(BD) |******|     10:15     |******|    No   |******|   Sylhet(BD)   |******| $50.95 |******");
		System.out.println("*********************************************************************************************************************************************************");
		System.out.println("***************************************************************| International Flight Information |******************************************************");
		System.out.println("*********************************************************************************************************************************************************");
		System.out.println("******| FN-475699 |******| Bangladesh Airlines |******| Dhaka(BD) |******|     02:50     |******|   Yes   |******|   Los  Angels |******| $122.35 |******");
		System.out.println("******| B-N-47569 |******|  US-Bangla Airlines |******| Dhaka(BD) |******|     23:15     |******|   Yes   |******|    Les Vages  |******| $202.5  |******");
		System.out.println("******| FN-100099 |******|    Regent Airways   |******| Dhaka(BD) |******|     19:45     |******|   Yes   |******|    EL Dorado  |******| $192.92 |******");
		System.out.println("******| BN-508799 |******|        Novoair      |******| Dhaka(BD) |******|     20:48     |******|    No   |******|    Austrilia  |******| $103.2 0|******");
		System.out.println("******|   FN-099  |******|   Dragon Airlines   |******| Dhaka(BD) |******|     24:00     |******|    No   |******|    Abu Dhabi  |******| $98.22  |******");
		System.out.println("*********************************************************************************************************************************************************");
		System.out.println("*********************************************************************************************************************************************************");
    }

}