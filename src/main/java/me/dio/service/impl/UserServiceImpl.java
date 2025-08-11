package me.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    //injeção de dependencia do UserRepository
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        // Implementation to find a user by ID
        return userRepository.findById(id)
                .orElseThrow(NoSuchElementException::new); // Placeholder exception handling
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
