package movieFlix;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allComments")
public class ControllerComments {
	
	@Autowired
	private UserRepository repositorycomment;
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAllComment()
	{
		return  repositorycomment.findAll();	

	}
}
