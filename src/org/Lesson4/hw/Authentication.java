package org.Lesson4.hw;

public class Authentication {
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Login is too long");
        }

        if (password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password is too long or doesn't match the confirmation");
        }

        return true;
    }
}