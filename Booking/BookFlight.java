package Booking;
import Extras.*;
import Flight.*;


import java.lang.*;
import java.io.*;
import java.util.*;

public class BookFlight extends FlightInformation
{
    private int numberOfPassenger;

    public BookFlight()
    {

    }

    public BookFlight(String from,String to,String departureTime,int numberOfPassenger)
    {
        super(from,to,departureTime);
        this.numberOfPassenger = numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger)
    {
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfPassenger()
    {
        return numberOfPassenger;
    }

    public void inputUserDetails(){
    Scanner type = new Scanner(System.in);
    System.out.println(" Enter Your Current Location : ");
    String from = type.nextLine();

    Scanner type1 = new Scanner(System.in);
    System.out.println(" Enter Your Destination : ");
    String to = type1.nextLine();

    Scanner type3 = new Scanner(System.in);
    System.out.println(" Enter Your Prefrred Date (DD/MM) : ");
    String departureTime = type3.nextLine();

    Scanner type4 = new Scanner(System.in);
    System.out.println(" Number Of Passengers : ");
    int numberOfPassenger = type4.nextInt();
	
	
	
	Report bookF = new Report();
	

     try{
     bookF.writeInFile1("From :");
     bookF.writeInFile1(from);
     bookF.writeInFile1("To :");
     bookF.writeInFile1(to);
     bookF.writeInFile1("Departure Time :");
     bookF.writeInFile1(departureTime);
     bookF.writeInFile1("----------------------");
     }catch (Exception e) {
            e.printStackTrace();
        }


    

    Scanner in = new Scanner(System.in);
	System.out.println("\r\n----------------------");
    System.out.println("Do You Want To See Your Booking? ");
    System.out.println("1. Yes ");
    System.out.println("2. No ");
    System.out.print("\r\nPress 1/2 : ");
    String option2 = in.nextLine();

        switch(option2)
            {  
             case "1" :
                {
					
                    System.out.println("\r\n----------------------");
                    bookF.readFromFile(); 
                   System.out.println("\r\n----------------------");
                   break;
                    }                    

                case "2" :
                {
                  break;
                }
            }
    System.out.print("Your Flight from ");
    System.out.print(from);
    System.out.print(" to ");
    System.out.print(to);
    System.out.print(" is booked at ");
    System.out.print(departureTime);
    System.out.print(".");
	}
}

