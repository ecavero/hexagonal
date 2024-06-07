package com.ecavero.hexagonal.application.repository;

import com.ecavero.hexagonal.domain.User;

public interface UserRepository {
    User findById(Long id);
    User save(User user);
}
