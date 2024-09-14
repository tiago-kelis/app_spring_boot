package Spring_app.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_app.app.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> { 
	
	

}
 