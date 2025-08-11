package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Classe de inicialização da aplicação Spring Boot
//Esta classe é responsável por iniciar o contexto da aplicação e carregar as configurações necessárias.
//A anotação @SpringBootApplication indica que esta é uma aplicação Spring Boot.
//O método main é o ponto de entrada da aplicação, onde o SpringApplication.run() é chamado para iniciar a aplicação.
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
