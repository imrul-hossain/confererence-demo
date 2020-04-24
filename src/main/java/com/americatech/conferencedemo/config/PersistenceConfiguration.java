package com.americatech.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// This is to store any additional configuration for your persistent tier
// This file is optional; the entity framework will still work without it
@Configuration
public class PersistenceConfiguration {


    // This will override the SQL settings from the properties or yml file. However this is not required
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://attrainingpg.postgres.database.azure.com:5432/conference_app");
//        builder.username("pgadmin@attrainingpg");
//        builder.password("");
//        System.out.println("Custom datasource bean has been initialized and set");
//        return builder.build();
//    }
}
