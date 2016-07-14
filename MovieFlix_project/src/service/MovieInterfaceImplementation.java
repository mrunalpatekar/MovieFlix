package movie.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.egen.api.entity.User;
import io.egen.api.exception.UserNotFound;
import movie.entity.movie;

@Repository
public class MovieInterfaceImplementation implements MovieInterface {

	
	MovieInterfaceImplementation repository;

	@Override
	public List<movie> findAll() {	
		return repository.findAll();
		}
	
	


}
