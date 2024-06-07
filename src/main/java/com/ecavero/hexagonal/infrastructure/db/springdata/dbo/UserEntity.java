package com.ecavero.hexagonal.infrastructure.db.springdata.dbo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {
    @Id
    private Long id;
    private String name;
    private String address;
}
