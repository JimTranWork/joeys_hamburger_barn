package joeys_hamburger_barn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import joeys_hamburger_barn.dao.DrinkRepository;
import joeys_hamburger_barn.models.Drink;

@Configuration
@ComponentScan(basePackages = "joeys_hamburger_barn")
@EnableAutoConfiguration
public class BootConfig {

	public static void main(final String[] args) {
		SpringApplication.run(BootConfig.class, args);
	}

	@Bean
	public CommandLineRunner loadData(final DrinkRepository repository) {
		return (args) -> {
			repository.save(new Drink("generic drink", 5));
		};
	}

}
