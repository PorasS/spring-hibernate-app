package com.pratech.springjpahibernateexample.repository;

import com.pratech.springjpahibernateexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(String name); //optional returns null in case no data found
}
