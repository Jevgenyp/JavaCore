package org.Lesson4.hw;

import static org.Lesson4.hw.Authentication.validate;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(validate("myloginqwertyuiopas", "mypassword", "mypassword"));
        } catch (WrongLoginException e) {
            System.out.println("Login error: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Password error: " + e.getMessage());
        }
    }
}
