package joeys_hamburger_barn.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import joeys_hamburger_barn.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, String> {
	@Override
	public List<Item> findAll();
}
