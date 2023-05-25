package Flight;
import Interfaces.*;

import java.lang.*;
import java.io.*;
import java.util.*;

public class FlightSatus implements Flight {
  public void showFlightStatus() 
  {
    // The body of showFlightStatus() is provided here

    System.out.println("******************************************************");
    System.out.println("***************| Flight Status |**********************");
    System.out.println("******************************************************");
    System.out.println("*****| Date    |******| Time  |*| Flight No  |********");
    System.out.println("******************************************************");
    System.out.println("*****| 20 Sept |******| 10:15 |*| FN-470399  |********");
    System.out.println("*****| 20 Sept |******| 13:30 |*| B-45-ABCD  |********");
    System.out.println("*****| 20 Sept |******| 15:00 |*| UN-309644  |********");
    System.out.println("*****| 20 Sept |******| 11:00 |*| UB-004455  |********");
    System.out.println("*****| 21 Sept |******| 09:45 |*| FN-104896  |********");
    System.out.println("*****| 21 Sept |******| 10:15 |*| GN-470399  |********");
    System.out.println("******************************************************");  
    System.out.println("******************************************************"); 
    }
}
