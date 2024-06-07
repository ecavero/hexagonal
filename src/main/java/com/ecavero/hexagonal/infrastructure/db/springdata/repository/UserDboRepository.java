package com.ecavero.hexagonal.infrastructure.db.springdata.repository;

import com.ecavero.hexagonal.application.repository.UserRepository;
import com.ecavero.hexagonal.domain.User;
import com.ecavero.hexagonal.infrastructure.db.springdata.mapper.UserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDboRepository implements UserRepository {
    private final SpringDataUserRepository userRepository;
    private final UserEntityMapper userMapper;

    @Override
    public User findById(Long id) {
        return userMapper.toDomain(userRepository.findById(id).orElseThrow());
    }

    @Override
    public User save(User user) {
        return userMapper.toDomain(userRepository.save(userMapper.toDbo(user)));
    }
}
