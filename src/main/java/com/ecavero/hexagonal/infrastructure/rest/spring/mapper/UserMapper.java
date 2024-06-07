package com.ecavero.hexagonal.infrastructure.rest.spring.mapper;

import com.ecavero.hexagonal.domain.User;
import com.ecavero.hexagonal.infrastructure.rest.spring.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toDomain(UserDto userDto);
}
