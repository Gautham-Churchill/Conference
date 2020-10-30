package com.gautham.conference.controller;

import com.gautham.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getuser(@RequestParam(value = "firstName", defaultValue = "Gautham") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Paranitharan") String lastName,
                        @RequestParam(value = "age", defaultValue = "25") int age){
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstname: " + user.getFirstName());
        return user;
    }
}
