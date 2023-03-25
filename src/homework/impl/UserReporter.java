package homework.impl;

import homework.Reportable;
import homework.User;

public class UserReporter implements Reportable<User> {

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
    
}
