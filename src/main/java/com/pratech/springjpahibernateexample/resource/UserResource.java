package com.pratech.springjpahibernateexample.resource;

import com.pratech.springjpahibernateexample.model.NewUser;
import com.pratech.springjpahibernateexample.model.User;
import com.pratech.springjpahibernateexample.repository.NewUserRepository;
import com.pratech.springjpahibernateexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/users")
@CrossOrigin("*")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @Autowired
    NewUserRepository newUserRepository;

    @RequestMapping(value = "/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @RequestMapping("/name/{name}")
    public List<User> findByName(@PathVariable("name") String name){
        return userRepository.findByName(name);
    }
//
//    @RequestMapping("/newname/{name}")
//    public List<NewUser> findByNewName(@PathVariable("name") String name){
//        return newUserRepository.findByName(name);
//    }

//    @RequestMapping("/add")
//    public void addUser(){
//        User user=new User();
//        user.setId(12);
//        user.setName("ganesh");
//        user.setSalary(1133433445);
//        user.setTeamName("iternals");
//        userRepository.save(user);
//    }

    @RequestMapping("/id/{id}")
    public Optional<User>  getUserById(@PathVariable("id") Integer id){
            Optional<User> user= userRepository.findById(id);
            return user;
    }

    @PostMapping(value="/add/user", consumes = "application/json")
    public void addComUser(@RequestBody User user){
        userRepository.save(user);
    }

    @PostMapping(value="/add/new/user", consumes = "application/json")
    public void addComUser(@RequestBody NewUser user){
        newUserRepository.save(user);
    }

    @GetMapping("/get/newuser/{name}")
    public NewUser getNewUser(@PathVariable("name") String name){
        return newUserRepository.findByUserName(name);
    }


}
