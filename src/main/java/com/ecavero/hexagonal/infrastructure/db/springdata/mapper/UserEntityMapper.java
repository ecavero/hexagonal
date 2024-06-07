package com.ecavero.hexagonal.infrastructure.db.springdata.mapper;

import com.ecavero.hexagonal.domain.User;
import com.ecavero.hexagonal.infrastructure.db.springdata.dbo.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
    User toDomain(UserEntity userEntity);
    UserEntity toDbo(User user);
}
