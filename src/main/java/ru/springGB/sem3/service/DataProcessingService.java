package ru.springGB.sem3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.springGB.sem3.User;
import ru.springGB.sem3.repository.UserRepo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataProcessingService {

    @Autowired
    private UserRepo userRepo;
    private RegistrationService registrationService;


    public String getGreeting(){
        return "!!Hello, world!";
    }

    public List<User> getAllUsers(){
        return userRepo.getAllUsers();
    }

    public void addUser(User user){
        userRepo.addUser(user);
    }

    public List<User> sortUserByAge(List<User> users){
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }

    public List<User> filterUserByAge(List<User> users, int age){
        return users.stream()
                .filter(user -> user.getAge()>age)
                .collect(Collectors.toList());
    }

    public double calculateAverageAge(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }
}
