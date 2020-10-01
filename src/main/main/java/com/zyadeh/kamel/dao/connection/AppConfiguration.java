package com.zyadeh.kamel.dao.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
@ComponentScan(basePackages = "com.zyadeh.kamel")
public class AppConfiguration {
    @Autowired
    Environment environment;

//    private JdbcTemplate jdbcTemplate;

    @Bean
    JdbcTemplate jdbcTemplate () {
        return new JdbcTemplate(dataSource());
    }

    @Autowired
    public AppConfiguration(Environment environment) {
        this.environment = environment;
    }

    //    private static Connection connection;
    private static final String url = "jdbc:postgresql://localhost:5432/news";
    private static final String username = "postgres";
    private static final String driver = "driver";
    private static final String password = "12345";

    @Bean
    DataSource dataSource () {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty(url));
        driverManagerDataSource.setUsername(environment.getProperty(username));
        driverManagerDataSource.setPassword(environment.getProperty(password));
        driverManagerDataSource.setDriverClassName(environment.getProperty(driver));
//        jdbcTemplate.setDataSource(driverManagerDataSource);
        return driverManagerDataSource;
    }



//    private ConnectionBuilder() {
//    }
//
//    static {
//        try {
//            Class.forName("org.postgresql.Driver");
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(url, username, password);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public static Connection getConnection() {
//        return connection;
//    }
}
