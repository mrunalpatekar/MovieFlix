
package movieFlix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private MovieRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
	
		//fetch all movies
		
		System.out.println("Movies all found with findAll():");
		System.out.println("-----------All Movies and Series--------------------");
		
		for (Movie mov : repository.findAll()) {
			System.out.println(mov.getTitle());			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(".................Filter Catalog by Type, Genre and Year...............");
		
		
		
		//Search by Genre
		System.out.println("----------Search by Genre----------------------");
		System.out.println(repository.findByGenre("Action, Sci-Fi, Thriller"));
		
		//Search by Year
		System.out.println("----------Search by Year----------------------");
		System.out.println(repository.findByYear("2015"));
	
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

			
		
	}	

}	
