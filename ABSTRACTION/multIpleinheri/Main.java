package multIpleinheri;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

interface SearchByGenre
{
	public abstract void searchByGenre(String genre);
}

interface SearchByTitle 
{
	public abstract void searchTitle(String title);
}

class Catalog implements SearchByTitle, SearchByGenre
{
	public static Date lastUpdated;

	public static List<Movie> MovieList = new ArrayList<Movie>();

	public void searchTitle(String title) 
	{
		for (Movie movie : MovieList) 
		{
			if (movie.getTitle().equals(title)) 
			{
				System.out.print(movie.getMovieDetail());
			}
		}
	}

	public void searchByGenre(String genre) 
	{
		for (Movie movie : MovieList) 
		{
			if (movie.getGenre().equalsIgnoreCase(genre))
			{
				System.out.print(movie.getMovieDetail());
			}
		}
	}

	
	
	
}

class Movie 
{
	private String title;
	private String genre ;
	private Date movieDate;
	private String lang;
	private String place ;
	private int rating ;
	
	public Movie(String title, String genre,int rating , Date movieDate , String lang , String place)
	{
		
		this.title = title;
		this.genre = genre;
		this.movieDate = movieDate;
		this.place = place;
		this.rating = rating;
		this.lang = lang ;
		
	}
	public String getTitle() 
	{
		return title;
	}
	public String getGenre() 
	{
		return genre;
	}
	public Date getMovieDate()
	{
		return movieDate;
	}
	
	public String getMovieDetail() 
	{
		return "| " + title + " | " + genre + " | " + movieDate + " | "+ rating + " | "+ lang +" |  "+ place +" |";
	}
	
	
}
public class Main {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub
		
		Catalog C = new Catalog();

        Calendar cal = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        Date date = cal.getTime();
        String todaysdate = dateFormat.format(date);

        Movie M1 = new Movie("AAA","Dra",3,date,"tamil","TN");
        C.MovieList.add(M1);
        Movie M2 = new Movie("bbb","act",1,date,"tamil","TN");
        C.MovieList.add(M2);
        Movie M3 = new Movie("ccc","rom",2,date,"tamil","TN");
        C.MovieList.add(M3);
        Movie M4 = new Movie("ddd","lov",4,date,"tamil","TN");
        C.MovieList.add(M4);
        
       
        System.out.println("--------------------------------------SEARCH BY GENRE--------------------------------------------");
        System.out.println();
        C.searchByGenre("lov");
        System.out.println();
        
        C.searchByGenre("rom");
        System.out.println();
        
        C.searchByGenre("act");
        System.out.println("\n");
        
        System.out.println("--------------------------------------SEARCH BY TITTLE-------------------------------------------");
        System.out.println();
        C.searchTitle("ccc");
        System.out.println();
        

	}

}
