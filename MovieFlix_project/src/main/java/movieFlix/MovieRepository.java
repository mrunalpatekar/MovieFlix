package movieFlix;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "movie", path = "Movies")
public interface MovieRepository extends MongoRepository<Movie, String> {

	//cross browser problem
	List<Movie> findByYear(@Param("year") String year);
	
	List<Movie> findByGenre(@Param("genre") String genre);
	
	//List<Movie> findByType(@Param("type") String type);

	List<Movie> findByTitle(@Param("title") String title);

	List<Movie> findByType(String type, Sort sort);

}
