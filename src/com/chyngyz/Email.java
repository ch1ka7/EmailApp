package com.chyngyz;

import java.util.Scanner;

/**
 * Created by Chyngyz on 06/1/2016.
 */

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private final int DEFAULT_PASSWORD_LENGTH = 8;
    private String department;
    private String email;
    private int mailBoxCapacity = 100;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "company.com";
        this.password = generateRandomPassword(DEFAULT_PASSWORD_LENGTH);
    }

    private String setDepartment() {
        System.out.print("DEPARTMENT CODES:" +
                "\n1 - General Management" +
                "\n2 - Marketing" +
                "\n3 - Operations" +
                "\n4 - Finance" +
                "\n5 - Sales" +
                "\n6 - Human Resource" +
                "\n7 - IT" +
                "\nEnter the department code: ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                return "genmanagement.";
            case 2:
                return "marketing.";
            case 3:
                return "operations.";
            case 4:
                return "finance.";
            case 5:
                return "sales.";
            case 6:
                return "hr.";
            case 7:
                return "it.";
        }
        return "";
    }

    private String generateRandomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void showInfo() {
        System.out.println("FULL NAME: " + firstName + " " + lastName);
        System.out.println("COMPANY EMAIL: " + email);
        System.out.println("MAILBOX CAPACITY: " + mailBoxCapacity + " MB");
    }
}
