package com.example.desafio.step;

import com.example.desafio.dominio.Cliente;
import com.example.desafio.tasklet.ObterMediaTasklet;
import com.example.desafio.writer.ClientesWriter;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdcbCursorReaderStepOrdenado {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step jdbcCursorReaderStepOrdenado(ItemReader<Cliente> jdbcCursorReaderOrdenado,
                                             ClientesWriter<Cliente> clientesWriter) {
        return stepBuilderFactory
                .get("jdbcCursorReaderStep")
                .<Cliente, Cliente>chunk(1)
                .reader(jdbcCursorReaderOrdenado)
                .writer(clientesWriter)
                .build();
    }

    @Bean
    public Step stepObterMedia(ObterMediaTasklet obterMediaTasklet) {
        return stepBuilderFactory
                .get("obterMediaTasklet")
                .tasklet(obterMediaTasklet)
                .build();
    }

}
