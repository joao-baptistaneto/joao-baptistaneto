package com.example.desafio.step;

import com.example.desafio.dominio.Cliente;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class JdcbCursorItemReaderStepOrdenado {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step jdbcCursorReaderStepQuery(ItemReader<Cliente> jdbcCursorReaderQuery,
                                          ItemWriter<Cliente> jdbcCursorWriterQuery) {
        return stepBuilderFactory
                .get("jdbcCursorReaderStep")
                .<Cliente, Cliente>chunk(1)
                .reader(jdbcCursorReaderQuery)
                .writer(jdbcCursorWriterQuery)
                .build();
    }

}
