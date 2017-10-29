package com.greenfox.nezih.finderproject.UserService;

import org.apache.catalina.User;

import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users;

    public UserService() {

        this.users = new ArrayList<>();
    }

    public ArrayList<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    public UserService service() {
        return new UserService();
    }
}
