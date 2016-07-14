package movieFlix;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

	@RepositoryRestResource(collectionResourceRel = "userRating", path = "userRating")
	public interface UserRatingRepository extends MongoRepository<UserRating, String> {

		 }
		

  