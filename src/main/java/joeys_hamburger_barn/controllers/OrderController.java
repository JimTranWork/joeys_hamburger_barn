package joeys_hamburger_barn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joeys_hamburger_barn.dao.ItemRepository;
import joeys_hamburger_barn.dao.OrderDetailsRepository;
import joeys_hamburger_barn.dao.OrderRepository;
import joeys_hamburger_barn.models.Item;
import joeys_hamburger_barn.models.Order;
import joeys_hamburger_barn.models.OrderDetails;

@RestController
public class OrderController {

	private final ItemRepository itemRepository;
	private final OrderRepository orderRepository;
	private final OrderDetailsRepository orderDetailsRepository;

	@Autowired
	public OrderController(final ItemRepository itemRepository, final OrderRepository orderRepository,
			final OrderDetailsRepository orderDetailsRepository) {
		this.itemRepository = itemRepository;
		this.orderRepository = orderRepository;
		this.orderDetailsRepository = orderDetailsRepository;
	}

	@RequestMapping("/hello")
	public String test() {
		return "Hello!";
	}

	@RequestMapping("/item/all")
	public List<Item> listItems() {
		return this.itemRepository.findAll();
	}

	@RequestMapping("/order/create")
	public Order createOrder(@ModelAttribute final Order order) {
		return this.orderRepository.save(order);
	}

	@RequestMapping("/order/details/add")
	public void addOrderDetails(@ModelAttribute final OrderDetails orderDetails) {
		this.orderDetailsRepository.save(orderDetails);
	}

}
