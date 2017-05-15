package joeys_hamburger_barn.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import joeys_hamburger_barn.models.CustomerOrder;

@Repository
public interface OrderRepository extends CrudRepository<CustomerOrder, String> {

}
