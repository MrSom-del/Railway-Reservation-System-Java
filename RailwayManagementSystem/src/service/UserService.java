package service;

import model.User;

import java.util.ArrayList;

public class UserService {

    private ArrayList<User> users = new ArrayList<>();

    private int userCounter = 1001;

    public void registerUser(String name,
                             String email,
                             String password) {

        User user = new User(
                userCounter++,
                name,
                email,
                password
        );

        users.add(user);

        System.out.println("User Registered Successfully!");
        System.out.println(user);
    }

    public User loginUser(String email,
                          String password) {

        for(User user : users) {

            if(user.getEmail().equals(email)
                    &&
                    user.getPassword().equals(password)) {

                return user;
            }
        }

        return null;
    }

    public void displayUsers() {

        for(User user : users) {
            System.out.println(user);
        }
    }
}