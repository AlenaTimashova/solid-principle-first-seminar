package homework;

import homework.impl.UserReporter;
import homework.impl.UserSaver;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        UserSaver usersaver = new UserSaver();
        usersaver.save(user);
        UserReporter userReporter = new UserReporter();
        userReporter.report(user);
    }
}