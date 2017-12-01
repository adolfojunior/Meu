package com.example.demo.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;

@Service
public class InMemoryUserService implements UserService {

  private Map<String, User> users = new ConcurrentHashMap<>();

  public InMemoryUserService() {
    // this.users.put("juan", new User("juan"));
  }

  @Override
  public User login(String username, String password) {
    // return this.validUsers.?
    return new User(username);
  }
}
