package joeys_hamburger_barn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import joeys_hamburger_barn.dao.ItemRepository;
import joeys_hamburger_barn.dao.OrderRepository;
import joeys_hamburger_barn.models.Item;
import joeys_hamburger_barn.models.CustomerOrder;

@Configuration
@ComponentScan(basePackages = "joeys_hamburger_barn")
@EnableAutoConfiguration
public class BootConfig {

	public static void main(final String[] args) {
		SpringApplication.run(BootConfig.class, args);
	}

	@Bean
	public CommandLineRunner loadData(final ItemRepository itemRepository, final OrderRepository orderRepository) {
		return (args) -> {
			itemRepository.save(new Item("Hamburger with cheese", 5.0));
			itemRepository.save(new Item("Hamburger without cheese", 4.5));
			itemRepository.save(new Item("Cocacola", 1.5));
			itemRepository.save(new Item("Fanta", 1.5));
			itemRepository.save(new Item("Chips", 1.5));
			orderRepository.save(new CustomerOrder());
		};
	}

}
