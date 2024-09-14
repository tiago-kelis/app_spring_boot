package Spring_app.app.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Spring_app.app.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findALL() {
		
		User u  = new User(1L, "Maria", "joana@gmail.com", "11980442552", "1234");
		
		return ResponseEntity.ok().body(u);
	}

}
