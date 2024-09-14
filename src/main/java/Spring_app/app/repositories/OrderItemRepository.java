package Spring_app.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_app.app.entities.OrderItem;
import Spring_app.app.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository< OrderItem, OrderItemPk> { 
	
	

}
