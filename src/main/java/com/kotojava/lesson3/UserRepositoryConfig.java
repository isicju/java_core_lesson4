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
        dataSource.setServerNames(new String[]{hostname});
        dataSource.setPortNumbers(new int[]{port});
        dataSource.setDatabaseName(database);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}
