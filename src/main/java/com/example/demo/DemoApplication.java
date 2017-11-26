package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public interface LoginService {

        Map<String, Object> login(String username, String password);
    }

    @Service
    public static class LoginServiceImpl implements LoginService {

        // private Map<String, User> validUsers = new ConcurrentHashMap<>();
        public LoginServiceImpl() {
//            this.validUsers.put("juan", new User("juan"));
        }

        @Override
        public Map<String, Object> login(String username, String password) {
//            return this.validUsers.?
            Map<String, Object> map = new HashMap<>();
            map.put("username", username);
            map.put("email", username + "@gmail.com");
            return map;
        }
    }

    @Bean
    public LoginService login() {
        return (user, pass) -> {
            return null;
        };
    }

    @RestController
    @RequestMapping("/api")
    public static class LoginController {

        @Autowired
        private LoginService loginService;

        @GetMapping("/login/{username}")
        public Map<String, Object> login(@PathVariable("username") String username) {
            return loginService.login(username, null);
        }
        
        boolean maiorQue1(int x) {
            return x > 1;
        }
    }
}
