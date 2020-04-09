package com.pratech.springjpahibernateexample.repository;

import com.pratech.springjpahibernateexample.model.NewUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewUserRepository extends JpaRepository<NewUser, Integer> {
                       NewUser findByUserName(String name);
}
