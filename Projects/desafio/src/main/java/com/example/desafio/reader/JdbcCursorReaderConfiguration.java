package com.example.desafio.reader;

import com.example.desafio.dominio.Cliente;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

@Configuration
public class JdbcCursorReaderConfiguration {

    @Bean
    public JdbcCursorItemReader<Cliente> jdbcCursorReaderOrdenado(
            @Qualifier("springDataSource") DataSource dataSource) {
        return new JdbcCursorItemReaderBuilder<Cliente>()
                .name("jdbcCursorReader")
                .dataSource(dataSource)
                //.sql("select * from tb_customer_account where vl_total > 560 and id_customer between 1700 and 2700;")
                .sql("select id_customer as id, cpf_cnpj as cpfOuCnpj, nm_customer as nome, is_active as ativo, " +
                        "vl_total as saldoTotal from tb_customer_account where vl_total > 560 and id_customer between " +
                        "1700 and 2700 " +
                        "and is_active = 1 order by vl_total desc;")
                .rowMapper(new BeanPropertyRowMapper<Cliente>(Cliente.class))
                .build();
    }
}