package Spring_app.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_app.app.entities.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {  
	
	

}
 