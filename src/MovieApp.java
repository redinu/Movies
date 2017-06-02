import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieApp {
	
	

	public static  void main(String[] args) {
		
		ArrayList<String> movies = new ArrayList<String>();
		
		Scanner scn = new Scanner(System.in);
		String cont = "y";
		
		System.out.println("Enter your favorite movies");
		
		while(cont.equalsIgnoreCase("y")){
			Movies movie = new Movies();
			movie.setTitle(scn.nextLine());
			System.out.println("Do you want to add another movie");
			cont = scn.nextLine();
			movies.add(movie.getTitle());
		}
		
		Collections.sort(movies);
		System.out.println();
		System.out.println("Your favorite movies are: ");
		for(String s: movies){
			System.out.println("- "+ s);
		}

	}

}
