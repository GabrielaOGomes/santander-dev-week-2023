package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Assinatura de método para verificar se o número da conta já existe
    boolean existsByAccountNumber(String accountNumber);
}
