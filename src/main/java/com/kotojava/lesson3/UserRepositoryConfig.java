package com.kotojava.lesson3;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class UserRepositoryConfig {

    @Value("${hostname}")
    String hostname;

    @Value("${port}")
    int port;

    @Value("${database}")
    String database;

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @Bean
    public DataSource pgUserDataSource() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setServerNames(new String[]{"158.220.122.4"});
        dataSource.setPortNumbers(new int[]{8787});
        dataSource.setDatabaseName("hr");
        dataSource.setUser("hr_admin");
        dataSource.setPassword("hr_password");
        return dataSource;
    }

}
