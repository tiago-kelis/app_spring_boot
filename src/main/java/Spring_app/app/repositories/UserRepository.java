package Spring_app.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_app.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
