package com.chyngyz;

/**
 * Created by Chyngyz on 06/1/2016.
 */

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("John", "Doe");
        email.setAlternateEmail("johndoe@gmail.com");
        email.showInfo();
    }
}
