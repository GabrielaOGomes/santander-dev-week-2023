package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

//@Entity é uma anotação que indica que uma classe Java
//é uma entidade persistente, ou seja, uma classe cujas 
//instâncias serão armazenadas em um banco de dados

@Entity(name = "tb_user")
public class User {

    //@Id e @GeneratedValue(strategy = GenerationType.IDENTITY)
    // são anotações utilizadas para definir a chave primária
    // de uma entidade e a estratégia de geração automática 
    //desse valor
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    //A anotação @OneToOne(cascade = CascadeType.ALL 
    //especifica um relacionamento um-para-um entre duas entidades,
    // onde todas as operações de persistência 
    //(como salvar, atualizar, remover) são aplicadas em cascata da
    // entidade pai para a entidade relacionada.
    @OneToOne(cascade= CascadeType.ALL)
    private Account account;

    @OneToOne(cascade= CascadeType.ALL)
    private Card card;
    //A anotação @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // indica um relacionamento um-para-muitos entre a entidade User
    // e as entidades Feature e News.
    // fetch = FetchType.EAGER define que os dados da entidade
    // relacionada devem ser carregados imediatamente quando a 
    //entidade pai é carregada. 
    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;
    // Construtor padrão
    // Este construtor é necessário para a criação de instâncias da classe User sem parâmetros.
    // Ele é utilizado pelo framework Spring para criar objetos User quando necessário.
    public User() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

}
