package com.example.desafio.repository;

import com.example.desafio.dominio.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("select avg(saldoTotal) from Cliente where saldoTotal > 560 and Id between 1700 and 2700 and ativo = true order by saldoTotal desc")
    BigDecimal calcularMedia();
}
