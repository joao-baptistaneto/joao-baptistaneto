package com.example.primeirojobspringbatch.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource springDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public DataSource appDataSource() {
        return DataSourceBuilder.create().build();
    }
}
