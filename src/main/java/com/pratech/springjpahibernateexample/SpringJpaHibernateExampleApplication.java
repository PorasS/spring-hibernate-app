package com.pratech.springjpahibernateexample;

import com.pratech.springjpahibernateexample.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackageClasses = UserRepository.class)
//@EnableJpaRepositories(basePackages = "com.pratech.springjpahibernateexample")
//@EnableJpaRepositories(basePackageClasses = NewUserRepository.class)
@SpringBootApplication
public class SpringJpaHibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateExampleApplication.class, args);
	}

}
