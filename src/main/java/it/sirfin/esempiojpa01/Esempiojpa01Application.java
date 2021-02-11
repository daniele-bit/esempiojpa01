package it.sirfin.esempiojpa01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"it.sirfin.esempiojpa01"})
@EnableJpaRepositories(basePackages= {"it.sirfin.esempiojpa01.repository"})
@EntityScan(basePackages= {"it.sirfin.esempiojpa01.model"})
public class Esempiojpa01Application {

	public static void main(String[] args) {
		SpringApplication.run(Esempiojpa01Application.class, args);
	}

}
