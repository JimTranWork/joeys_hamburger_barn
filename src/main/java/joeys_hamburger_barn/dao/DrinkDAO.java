package joeys_hamburger_barn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import joeys_hamburger_barn.models.Drink;
import joeys_hamburger_barn.util.AutowireUtil;

public class DrinkDAO {
	
	@Autowired
	private final DrinkRepository repository;
	
	public DrinkDAO() {
		repository = AutowireUtil.getApplicationContext().getBean(DrinkRepository.class);
	}
	
	public List<Drink> findAll() {
		return repository.findAll();
	}
	
}
