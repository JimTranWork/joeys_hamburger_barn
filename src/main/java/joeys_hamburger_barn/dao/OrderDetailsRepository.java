package joeys_hamburger_barn.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import joeys_hamburger_barn.models.OrderDetails;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, String> {
	@Override
	public List<OrderDetails> findAll();
}
