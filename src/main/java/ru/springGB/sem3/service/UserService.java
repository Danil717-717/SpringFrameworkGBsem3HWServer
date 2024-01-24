package ru.springGB.sem3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.springGB.sem3.User;

@Service
public class UserService {

    private final NotificationService notificationService;


    @Autowired
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;

    }

    public User createUser(String name, int age, String email){

        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        notificationService.notifyCreatedUser(user);

        return user;
    }
}
