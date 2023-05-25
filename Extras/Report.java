package Extras;
import Booking.*;



import java.lang.*;
import java.io.*;
import java.util.*;

public class Report
{
    private File file;				//to create a File
    private FileReader reader;		//to read from a file
    private BufferedReader bfr;		//to read file content

    public Report() {

    }


    public void writeInFile(String s)
    {
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
        try
        {
            file = new File("Feedaback.txt");			//Declaring a file named named Feedaback.txt for creating.
            file.createNewFile();					//If the file does not exists, creates and opens the file. else, just opens the file
            //to write in a file
            FileWriter writer = new FileWriter(file, true);    //creating the writer object to write in the file.
            writer.write(s+"\r"+"\n");				//writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
            writer.flush();							//After writing, we need to flush to indicate that we have completed writing.
            writer.close();							//After flushing, we need to close the file to save our writing.
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public void writeInFile1(String s)
    {
        /*
            creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
            So, we need to write the whole thing in try-catch.
        */
        try
        {
            file = new File("Booking.txt");         //Declaring a file named named Booking.txt for creating.
            file.createNewFile();                   //If the file does not exists, creates and opens the file. else, just opens the file
            //to write in a file
            FileWriter writer = new FileWriter(file, true);    //creating the writer object to write in the file.
            writer.write(s+"\r"+"\n");              //writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
            writer.flush();                         //After writing, we need to flush to indicate that we have completed writing.
            writer.close();                         //After flushing, we need to close the file to save our writing.
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public void writeInFile2(String s)
    {
        /*
            creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
            So, we need to write the whole thing in try-catch.
        */
        try
        {
            file = new File("BookingH.txt");         //Declaring a file named named BookingH.txt for creating.
            file.createNewFile();                   //If the file does not exists, creates and opens the file. else, just opens the file
            //to write in a file
            FileWriter writer = new FileWriter(file, true);    //creating the writer object to write in the file.
            writer.write(s+"\r"+"\n");              //writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
            writer.flush();                         //After writing, we need to flush to indicate that we have completed writing.
            writer.close();                         //After flushing, we need to close the file to save our writing.
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }


    public void readFromFile()
    {
		/*
			reading from a file genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/

        try
        {
            reader = new FileReader(file);			//creating the reader object to read from a file.
            bfr = new BufferedReader(reader);		//creating the BufferedReader object using the reader object to read the file content.
            String text="", temp;					//declaring two string variables to read the file content and storing them.

            while((temp=bfr.readLine())!=null)		//reading one line from the file, storing it in the variable temp and checking whether it is null or not. It will be null at the end of reading from the file.
            {
                text=text+temp+"\n"+"\r";			//storing the temp string in text by concating it with text and "n" and "\r" is used to go to a newline.
            }

            System.out.print(text);   				//printing the whole string in console.
            reader.close();							//closing the file.
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }




    public void deleteFile(){
        try{
            FileOutputStream writer = new FileOutputStream("Feedaback.txt");
                writer.write(("").getBytes());
                writer.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void deleteFile1(){
        try{
            FileOutputStream writer = new FileOutputStream("Booking.txt");
                writer.write(("").getBytes());
                writer.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteFile2(){
        try{
            FileOutputStream writer = new FileOutputStream("BookingH.txt");
                writer.write(("").getBytes());
                writer.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}

