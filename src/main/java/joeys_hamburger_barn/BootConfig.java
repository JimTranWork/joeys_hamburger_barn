package joeys_hamburger_barn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import joeys_hamburger_barn.dao.ItemRepository;
import joeys_hamburger_barn.models.Item;

@Configuration
@ComponentScan(basePackages = "joeys_hamburger_barn")
@EnableAutoConfiguration
public class BootConfig {

	public static void main(final String[] args) {
		SpringApplication.run(BootConfig.class, args);
	}

	@Bean
	public CommandLineRunner loadData(final ItemRepository itemRepository) {
		return (args) -> {
			itemRepository.save(new Item("Hamburger with cheese", 5.0));
			itemRepository.save(new Item("Hamburger without cheese", 4.5));
			itemRepository.save(new Item("Hamburger with pickle", 6.0));
			itemRepository.save(new Item("Hamburger without pickle", 4.5));
			itemRepository.save(new Item("Cocacola", 1.5));
			itemRepository.save(new Item("Fanta", 1.5));
			itemRepository.save(new Item("7up", 1.0));
			itemRepository.save(new Item("Mountain Dew", 1.0));
			itemRepository.save(new Item("Small chips", 3));
			itemRepository.save(new Item("Medium chips", 6));
			itemRepository.save(new Item("Large chips", 9));
		};
	}

}
