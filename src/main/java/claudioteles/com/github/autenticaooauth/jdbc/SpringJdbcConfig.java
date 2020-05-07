package claudioteles.com.github.autenticaooauth.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("claudioteles.com.github.autenticaooauth.jdbc")
public class SpringJdbcConfig {
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
        dataSource.setUrl("jdbc:hsqldb:file:database/hsqldb/hsqldb");
        dataSource.setUsername("Claudio");
        dataSource.setPassword("hsqldb123");
 
        return dataSource;
    }
    
	/*
	 * @Bean public DataSource dataSource() { return new EmbeddedDatabaseBuilder()
	 * .setType(EmbeddedDatabaseType.HSQL) .addScript("classpath:schema.sql")
	 * .addScript("classpath:test-data.sql").build(); }
	 */
    
}
