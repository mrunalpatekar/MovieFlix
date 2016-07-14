package movieFlix;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "ratings", path = "ratings")
public interface RatingsRepository extends MongoRepository<Ratings,String>{
	
}
