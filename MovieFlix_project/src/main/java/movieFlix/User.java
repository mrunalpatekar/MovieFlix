package movieFlix;

import java.util.List;

import org.springframework.data.annotation.Id;

public class User {
@Id private String id;
	private String userId;
	private List<Comment> comments;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	

	
	

	
	
	
}
