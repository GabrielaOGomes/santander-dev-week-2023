package me.dio.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // A anotação @Column(unique = true) indica que o campo
    // "number" deve ser único no banco de dados, ou seja,
    // não pode haver duas contas com o mesmo número.
    // Isso é importante para garantir a integridade dos dados
    @Column(unique = true)
    private String number;

    private String agency;

    // A anotação @Column(precision= 2, scale= 13) indica que o campo
    // "balance" e "limit" são do tipo numérico com precisão de 2
    // dígitos antes do ponto decimal e 13 dígitos após o ponto decimal.
    // Isso é útil para armazenar valores monetários com alta precisão.
    @Column(precision = 13, scale = 2)
    private String balance;

    @Column(name = "Additional_limit", precision = 13, scale = 2)
    private String limit;

    public Account() {
    }

    public Account(Long id, String number, String agency, String balance, String limit) {
        this.id = id;
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

}
