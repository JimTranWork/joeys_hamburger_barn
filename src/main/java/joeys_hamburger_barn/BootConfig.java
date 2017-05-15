package joeys_hamburger_barn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "joeys_hamburger_barn")
@EnableAutoConfiguration
public class BootConfig {

	public static void main(final String[] args) {
		SpringApplication.run(BootConfig.class, args);
	}

}
