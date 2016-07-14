package movieFlix;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Movies/getall")
public class Controller {

@Autowired
private MovieRepository repository;

//Get all the Movies and Series 
@CrossOrigin(origins = "*")
@RequestMapping(method=RequestMethod.GET)
public List<Movie> getAll()
{
	return  repository.findAll();	
}

//Search by Type:Series
//url: http://localhost:8080/Movies/getall/series/

@CrossOrigin(origins = "*")
@RequestMapping(method=RequestMethod.GET, value = "/series")
public List<Movie> findByTypeSeries(){
return repository.findByType("series",new Sort(Sort.Direction.DESC,"imdbRating"));
}

//Search by Type:Movie
//url: http://localhost:8080/Movies/getall/movie/
@CrossOrigin(origins = "*")
@RequestMapping(method=RequestMethod.GET, value = "/movie")
public List<Movie> findByTypeMovie(){
return repository.findByType("movie",new Sort(Sort.Direction.DESC,"imdbRating"));
}

//Search by Genre:Adventure, Drama, Fantasy
//url: http://localhost:8080/Movies/getall/genre/
@RequestMapping(method=RequestMethod.GET, value = "/genre")
public List<Movie> findByTypeGenre(){
return repository.findByGenre("Adventure, Drama, Fantasy");
}


//Sorting
//sorting by IMDB Rating
//url:http://localhost:8080/Movies/getall/sortByYear
@RequestMapping(method=RequestMethod.GET, value = "/sortByYear")
public List<Movie> sortByYear()
{
	return  repository.findAll(new Sort(Sort.Direction.DESC,"year"));	
}


//sorting by 
//url:http://localhost:8080/Movies/getall/sortByimdbRating
@RequestMapping(method=RequestMethod.GET, value = "/sortByimdbRating")
public List<Movie> sortByimdbRating()
{	
	return repository.findAll(new Sort(Sort.Direction.DESC,"imdbRating"));	
//	return repository.findAll(new PageRequest(0,10, new Sort(Sort.Direction.DESC,"imdbRating")));	

}

//sorting by 
//url:http://localhost:8080/Movies/getall/sortByimdbVotes
@RequestMapping(method=RequestMethod.GET, value = "/sortByimdbVotes")
public List<Movie> sortByimdbVotes()
{
	return  repository.findAll(new Sort(Sort.Direction.DESC,"imdbVotes"));	
}



//	@RequestMapping(method=RequestMethod.GET, value = "Movie/{id}")
//	public Movie findOne(@PathVariable("id") String id) {
//		return repository.findOne(id);
//	}


}