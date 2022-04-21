package com.example.desafio.writer;

import com.example.desafio.dominio.Cliente;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientesWriter<Cliente> implements ItemWriter<Cliente> {

    @Override
    public void write(List<? extends Cliente> list) throws Exception {
        System.out.println("Cliente usado para calculo de média");
        list.forEach(System.out::println);
    }
}
