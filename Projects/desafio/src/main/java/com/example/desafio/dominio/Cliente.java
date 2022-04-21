package com.example.desafio.dominio;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_customer_account")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Long Id;
    @Column(name = "cpf_cnpj")
    private Long cpfOuCnpj;
    @Column(name = "nm_customer")
    private String Nome;
    @Column(name = "is_active")
    private Boolean ativo;
    @Column(name = "vl_total")
    private BigDecimal saldoTotal;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(Long cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Id=" + Id +
                ", cpfOuCnpj=" + cpfOuCnpj +
                ", Nome='" + Nome + '\'' +
                ", ativo=" + ativo +
                ", saldoTotal=" + saldoTotal +
                '}';
    }
}