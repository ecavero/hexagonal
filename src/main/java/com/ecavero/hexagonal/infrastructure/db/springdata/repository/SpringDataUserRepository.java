package com.ecavero.hexagonal.infrastructure.db.springdata.repository;

import com.ecavero.hexagonal.infrastructure.db.springdata.dbo.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataUserRepository extends JpaRepository<UserEntity, Long> {
}
