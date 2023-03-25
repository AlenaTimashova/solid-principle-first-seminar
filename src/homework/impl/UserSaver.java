package homework.impl;

import homework.Savable;
import homework.User;

public class UserSaver implements Savable<User> {

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
    
}
