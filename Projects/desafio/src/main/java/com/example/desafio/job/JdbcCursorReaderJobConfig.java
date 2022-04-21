package com.example.desafio.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class JdbcCursorReaderJobConfig {
    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job jdbcCursorReaderJob(Step jdbcCursorReaderStepOrdenado, Step stepObterMedia) {
        return jobBuilderFactory
                .get("jdbcCursorReaderJob")
                .start(stepObterMedia)
                .next(jdbcCursorReaderStepOrdenado)
                .incrementer(new RunIdIncrementer())
                .build();
    }
}