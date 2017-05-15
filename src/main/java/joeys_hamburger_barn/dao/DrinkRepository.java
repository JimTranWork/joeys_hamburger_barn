package joeys_hamburger_barn.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import joeys_hamburger_barn.models.Drink;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, String> {
	public List<Drink> findAll();
}
