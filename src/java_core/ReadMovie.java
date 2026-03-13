package java_core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner ;

public class ReadMovie 
{
	public static void main (String args[]) throws ParseException
	{
		Scanner sc = new Scanner (System.in); // Scanner class called by the obj
		
		System.out.print("Enter Movie Id : ");
		int id = sc.nextInt(); // the movie id was get
		sc.nextLine();// remove the extra space (buffer)
		
		System.out.print("Enter Movie Name : ");
		String name = sc.nextLine(); // the movie name was get
		
		System.out.print("Enter Movie Description : ");
		String desc = sc.nextLine(); // the movie description was got 
		
		System.out.print("Enter Movie Language : ");
		String lang = sc.nextLine(); // the movie language was got an input
		
		System.out.print("Enter Movie Genrese	 : ");
		String genre = sc.nextLine(); // the movie gener was got an input
		
		System.out.print("Enter Movie Release Date : ");
		String date = sc.nextLine();
		SimpleDateFormat moviereleasedate = new SimpleDateFormat("dd/MM/YY");// calling the exting date class and create the obj 
		Date moviedate = moviereleasedate.parse(date); // assign the date
		
		System.out.print("Enter Movie Seat Cost : ");
		float cost = sc.nextFloat(); // the movie cost was got an input 
		
		System.out.println("ENTERED MOVIE DETAILS ARE"); // the all data's are printed
		
		System.out.println("Movie ID : "+ id);
		System.out.println("Movie Name : "+ name);
		System.out.println("Movie Description : "+ desc);
		System.out.println("Movie Language : "+ lang);
		System.out.println("Movie Gener : "+genre);
		System.out.println("Movie ReleaseDate : "+ date);
		System.out.println("Movie SeatCost : "+ cost);
	}
}
