package Booking;
import Extras.*;
import Flight.*;
import Interfaces.*;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Passenger
{
    private int age;
    private String name;
    
    static {
        System.out.print( "\r\nHow Many Reservation You Want to Book/Cancel: ");
    }

    
    Scanner i = new Scanner(System.in);
    int length = i.nextInt();
    BookHoliday bookHoliday[]=new BookHoliday[length];
    CancelFlight cancelFlight=new CancelFlight();
    


    public Passenger()
    {

    }

    public Passenger(int age, String name) //, int size1, int size2
    {
        this.age=age;
        this.name=name;
    }

    

    public void setAge (int age)
    {
        this.age=age;
    }

    public void setName (String name)
    {
        this.name=name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void addBookHoliday(BookHoliday bh)
    {
        int flag=0;
        for(int i=0;i<bookHoliday.length;i++)
        {
            if(bookHoliday[i]== null)
            {

                bookHoliday[i]=bh;

             int count = 0;
             for(int j=0;j<bookHoliday.length;j++)
             {

             Scanner type = new Scanner(System.in);
             System.out.println("\r\n \r\n **********************************");
             System.out.println("\r\n Enter Your Current Location : ");
             String from = type.nextLine();

             Scanner type1 = new Scanner(System.in);
             System.out.println(" Enter Your Destination : ");
             String to = type1.nextLine();

             Scanner type3 = new Scanner(System.in);
             System.out.println(" Enter Your Prefrred Date to Travel (DD/MM) : ");
             String departureTime = type3.nextLine();

            Scanner type5 = new Scanner(System.in);
            System.out.println(" Enter Your Prefrred Return Date (DD/MM) : ");
            String returnTime = type5.nextLine();

            Scanner type4 = new Scanner(System.in);
            System.out.println(" Number Of Passengers : ");
            int numberOfPassenger = type4.nextInt();


                Report bookF1 = new Report();
    
                try{
                bookF1.writeInFile2("From :");
                bookF1.writeInFile2(from);
                bookF1.writeInFile2("To :");
                bookF1.writeInFile2(to);
                bookF1.writeInFile2("Departure Time :");
                bookF1.writeInFile2(departureTime);
                bookF1.writeInFile2("Returning Time :");
                bookF1.writeInFile2(returnTime);
                bookF1.writeInFile2("----------------------");
                //bookF1.writeInFile2(numberOfPassenger);
                }catch (Exception e) {
                       e.printStackTrace();
                   }


    

               Scanner in = new Scanner(System.in);
               System.out.println("\r\n----------------------");
               System.out.println("Do You Want To See Your Holiday Booking? ");
               System.out.println("1. Yes ");
               System.out.println("2. No ");
               System.out.print("\r\nPress 1/2 : ");
               String option2 = in.nextLine();

                   switch(option2)
                       {  
                        case "1" :
                           {
                    
                                          System.out.print("Your Flight from ");
                                          System.out.print(from);
                                          System.out.print(" to ");
                                          System.out.print(to);
                                          System.out.print(" is booked at ");
                                          System.out.print(departureTime);
                                          System.out.print(" & you will be returning at ");
                                          System.out.print(returnTime);
                                          System.out.print("."); 
                                          System.out.println("\r\n----------------------");
                              break;
                               }                    

                           case "2" :
                           {
                             break;
                           }
                       }


                 

              } 
     
                flag=1;
                break;
            }

        }
        if(flag==1)
        {
            System.out.println("\r\n\n#####################################");
            System.out.print("## You Have Booked Total "+length);
            System.out.print(" Flight. ##");
            System.out.println("\n#####################################");
        }
        else
        {
            System.out.println("\r\nNo Reservation.");
        }
    }

    public void removeCancelFlight(CancelFlight ch)
    {
       
        cancelFlight = null;
        
        if(cancelFlight == null)
        {
            System.out.println("\r\nCurrently This Feature is not Available. \nSorry For Your Inconvenience.");
        }
        else
        {
            System.out.println("\r\nCurrently This Feature is not Available. \nSorry For Your Inconvenience.");
        }
    }
}

