package movie.service;

import java.util.List;

import io.egen.api.entity.User;
import movie.entity.movie;

public interface MovieInterface {

	public List<movie> findAll();
	
	
}
