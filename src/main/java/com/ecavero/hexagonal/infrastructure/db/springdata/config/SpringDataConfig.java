package com.ecavero.hexagonal.infrastructure.db.springdata.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.ecavero.hexagonal.infrastructure.db.springdata")
@EnableJpaRepositories(basePackages = "com.ecavero.hexagonal.infrastructure.db.springdata.repository")
@ConfigurationProperties("spring.datasource")
@NoArgsConstructor
@Getter
@Setter
@EnableJpaAuditing
@EntityScan(basePackages = "com.ecavero.hexagonal.infrastructure.db.springdata.dbo")
public class SpringDataConfig {
}
