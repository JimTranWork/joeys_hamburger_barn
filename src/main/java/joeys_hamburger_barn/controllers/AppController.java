package joeys_hamburger_barn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joeys_hamburger_barn.dao.CustomerOrderRepository;
import joeys_hamburger_barn.dao.ItemRepository;
import joeys_hamburger_barn.dao.OrderDetailsRepository;
import joeys_hamburger_barn.models.CustomerOrder;
import joeys_hamburger_barn.models.Item;
import joeys_hamburger_barn.models.OrderDetails;

@RestController
public class AppController {

	private final ItemRepository itemRepository;
	private final CustomerOrderRepository customerOrderRepository;
	private final OrderDetailsRepository orderDetailsRepository;

	@Autowired
	public AppController(final ItemRepository itemRepository, final CustomerOrderRepository customerOrderRepository,
			final OrderDetailsRepository orderDetailsRepository) {
		this.itemRepository = itemRepository;
		this.customerOrderRepository = customerOrderRepository;
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
	public CustomerOrder createOrder() {
		return this.customerOrderRepository.save(new CustomerOrder());
	}

	@RequestMapping("/order/details/add")
	public OrderDetails addOrderDetails(@ModelAttribute final OrderDetails orderDetails) {
		return this.orderDetailsRepository.save(orderDetails);
	}

	@RequestMapping("order/all")
	public List<OrderDetails> listOrderDetails() {
		return this.orderDetailsRepository.findAllByOrderByTimestampDesc();
	}

}
