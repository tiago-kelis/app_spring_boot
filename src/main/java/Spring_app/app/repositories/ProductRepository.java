package Spring_app.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_app.app.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {  
	
	

}
 