package lab9example1.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ProjectConfig {

//    @Bean
//    public DataSource dataSource()  {
//        var dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:mysql://localhost:3306/lab9");
//        dataSource.setUsername("root");
//        dataSource.setPassword("1234");
//
//        return dataSource;
//    }
//
//    @Bean
//    public JdbcTemplate jdbcTemplate()  {
//        return new JdbcTemplate(dataSource());
//    }
}
