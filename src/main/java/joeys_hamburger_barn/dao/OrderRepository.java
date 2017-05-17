package joeys_hamburger_barn.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import joeys_hamburger_barn.models.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {

}
