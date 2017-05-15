package joeys_hamburger_barn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joeys_hamburger_barn.dao.DrinkDAO;
import joeys_hamburger_barn.dao.DrinkRepository;
import joeys_hamburger_barn.models.Drink;

@RestController
public class OrderController {

	private DrinkRepository repository;
	
	@Autowired
	public OrderController(DrinkRepository repository) {
		this.repository = repository;
	}

	@RequestMapping("/hello")
	public String test() {
		return "Hello!";
	}

	@RequestMapping("/drink/all")
	public List<Drink> drinkFindAll() {
		return repository.findAll();
	}

}
