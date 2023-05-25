package Booking;
import Flight.*;


import java.lang.*;
import java.io.*;
import java.util.*;

public class BookHoliday extends FlightInformation
{

    private String returnTime;
    private int numberOfPassenger;

    public BookHoliday(){

    }

  public  BookHoliday(String from, String to, String departureTime, String returnTime, int numberOfPassenger) {
        super(from, to, departureTime);
        this.returnTime=returnTime;
        this.numberOfPassenger=numberOfPassenger;
    }



    public void setReturnTime (String returnTime)
    {
        this.returnTime=returnTime;
    }

    public void setNumberOfPassenger (int numberOfPassenger)
    {
        this.numberOfPassenger=numberOfPassenger;
    }


    public String getReturnTime()
    {
        return returnTime;
    }

    public int getNumberOfPassenger()
    {
        return numberOfPassenger;
    }



}

