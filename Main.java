import Booking.*;
import Extras.*;
import Flight.*;
import Interfaces.*;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
       
        for(int i=1;i<4;){
        System.out.print("Enter Username: ");
        Scanner type = new Scanner(System.in);
        String user = type.nextLine();
        System.out.print("Enter Password: ");
        String password = type.nextLine();
        if(user.equals("1") && password.equals("1")){


        while (true){
            System.out.println("*************************************************");
            System.out.println("*************************************************");
            System.out.println(" Welcome To Airplane Transport Management System ");
            System.out.println("*************************************************");
            System.out.println("**************|Here Are Some Option|*************");
            System.out.println("*************************************************");
            System.out.println("**************| 1. Flight Status   |*************");
            System.out.println("**************| 2. Plan A Trip     |*************");
            System.out.println("**************| 3. Report          |*************");
            System.out.println("**************| 4. About Us        |*************");
            System.out.println("**************| 5. Exit            |*************");
            System.out.println("*************************************************");
            System.out.println("*************************************************");


            Scanner in = new Scanner(System.in);
            System.out.print("Enter Your Choice : ");
            String option = in.nextLine();

            switch(option)
            {
                case "1" :
                {
                    FlightSatus fs = new FlightSatus();
                    fs.showFlightStatus();
                    break;
                }

                case "2" :
                {
                    System.out.println("**************************************************");
                    System.out.println("**************************************************");
                    System.out.println("**********| You Want To Set Up A Trip |***********");
                    System.out.println("**************************************************");
                    System.out.println("************| Here Are Some Option  |*************");
                    System.out.println("**************************************************");
                    System.out.println("************| 1. Flight Information |*************");
                    System.out.println("************| 2. Book Flight        |*************");
                    System.out.println("************| 3. Book Holiday       |*************");
                    System.out.println("************| 4. Cancel Reservation |*************");
                    System.out.println("**************************************************");
                    System.out.println("**************************************************");


                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Enter Your Choice : ");
                    String option1 = in1.nextLine();

                    FlightInformation f1 = new FlightInformation();
                    BookFlight bf1 = new BookFlight();
				          	Report r1 = new Report();
				          	BookHoliday b1 = new BookHoliday();
                    CancelFlight c1 = new CancelFlight();
                    
                    

                    switch(option1)
                    {
                        case "1" :
                        {
                            System.out.println(" You Want To Know The Flight Information.");
                            f1.showFlightInfo();
                               
                            break;
                        }

                        case "2" :
                        {
                            System.out.println("You Want To Book A Flight. ");

                            bf1.inputUserDetails();         
                            break;
                        }

                        
                        case "3" :
                        {
                            System.out.println("You Want To Book Flight For Holiday Plan.");

                            Passenger p1 = new Passenger();
                            p1.addBookHoliday(b1);
                            break;
                        }

                        case "4" :
                        {


						             System.out.println("\r\n----------------------");
                         System.out.println("Which Reservation You Want To Cancel?");
                         System.out.println("1. Only Flight");
                         System.out.println("2. Only Holiday");
                         System.out.println("3. All");
  							         System.out.print("\r\nPress 1/2/3 : ");
  							         String option2 = in.nextLine();
							
                            switch(option2)
           				         {
                             case "1" :
          				              {
                                  Scanner sc = new Scanner(System.in);
                                  System.out.println("ARE YOU SURE YOU WANT TO CANCEL YOUR FLIGHT?.");
                                  System.out.println("1. Yes ");
                                  System.out.println("2. No ");
                                  System.out.print("\r\nPress 1/2 : ");
                                  String option3 = sc.nextLine();
           				                switch(option3)
                                   {  
                                    case "1" :
                                {
                                   r1.deleteFile1();
                                   System.out.println("Your Flight Has Been Cancelled.");
                                   System.out.println("Thank You.");
                                  break;
                                   }                    

                                case "2" :
                               {
                                 System.out.println("Thank You For Your Great Patience.");
                                 break;
                                }
                               }
                               break;
             				           }                    

            				            case "2" :
             				           {
                                  Passenger p1 = new Passenger();
                                  p1.removeCancelFlight(c1);
                               break;
                				        }


                                case "3" :
                               {
                                  Scanner sc = new Scanner(System.in);
                                  System.out.println("ARE YOU SURE YOU WANT TO CANCEL ALL RESERVATIONS?.");
                                  System.out.println("1. Yes ");
                                  System.out.println("2. No ");
                                  System.out.print("\r\nPress 1/2 : ");
                                  String option3 = sc.nextLine();
                                  switch(option3)
                                   {  
                                    case "1" :
                                {
                                   r1.deleteFile1();
                                   r1.deleteFile2();
                                   System.out.println("Your All Reservations Are Cancelled.");
                                   System.out.println("Thank You.");
                                  break;
                                   }                    

                                case "2" :
                               {
                                 System.out.println("Thank You For Your Great Patience.");
                                 break;
                                }
                               }
                                }
                                break;
           				         }

							//System.out.print("For Some Reason This Feature Isn't Available Right Now.");
							//System.out.print("In Next Update This Feature Willbe Workable Properly.\n\n");
							
							
                            break;
                        }
                    }

                    break;
                }

                

                case "3" :
                {
                    Report frwd = new Report();
                    System.out.println("How can we improve your experience (Feedback):");
                    String feedback = type.nextLine();

                    System.out.println("----------------------");
                    frwd.deleteFile();
                    frwd.writeInFile(feedback);

                    Scanner in1 = new Scanner(System.in);
                    System.out.println("Do You Want To See Your Feedback? ");
                    System.out.println("1. Yes ");
                    System.out.println("2. No ");
                    String option2 = in.nextLine();

                    switch(option2)
                         {  
                           case "1" :
                           {
                            System.out.println("\r\n----------------------");
                            frwd.readFromFile();
                            System.out.println("----------------------");
                              break;
                            }                    

                           case "2" :
                           {
                              break;
                            }                    
                    
                 }
                 break;
             }


                case "4" :
                {
                    AboutUs us = new AboutUs();
                    us.aUs();
                    break;
                }

                 case "5" :
                {

                    System.out.println("\r\nHAVE A NICE DAY");
                    System.exit(0);
                 }
             
         } 

          
          Scanner type5 = new Scanner(System.in);
          System.out.println("\r\n\n----------------------");
          System.out.println("Press Any Button To Continue.");
          String answer = type5.nextLine();
          // Get input here.
          if (answer=="Y" || answer=="y") {
          continue;
          } 
          if (answer=="N" || answer=="n")
          {
           break;
       }

        }
        }
        else
        {
            System.out.println("\nInvalid user or password!\n");
            i++;
        }

     
        }
    }
}







