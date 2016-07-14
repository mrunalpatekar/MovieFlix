package movieFlix;

import java.util.List;

import org.springframework.data.annotation.Id;

public class UserRating {

	@Id private String id;
	private String userId;
	private List<Ratings> ratings;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Ratings> getRatings() {
		return ratings;
	}
	public void setRatings(List<Ratings> ratings) {
		this.ratings = ratings;
	}
	
}
