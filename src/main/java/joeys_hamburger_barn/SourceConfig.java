package joeys_hamburger_barn;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class SourceConfig {

	@Bean
	public DataSource dataSource() {
		final EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		final EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL).build();
		return db;
	}

}
