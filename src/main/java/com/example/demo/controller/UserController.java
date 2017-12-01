package com.example.demo.controller;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/login")
  public User login(@RequestParam("username") String username,
      @RequestParam("password") String password) {
    return userService.login(username, password);
  }

  @GetMapping("/all")
  public List<User> allUsers() {
    // TODO list all the current users
    return Collections.emptyList();
  }

  @PostMapping
  public User createUser(User user) {
    // TODO create an user
    return null;
  }

  @PutMapping("/{username}")
  public User updateUser(@PathVariable("username") String username, User user) {
    // TODO create an user
    return null;
  }

  @DeleteMapping("/{username}")
  public User deleteUser(@PathVariable("username") String username) {
    // TODO delete an user
    return null;
  }
}
