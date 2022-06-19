package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Name : ");
        String firstName= sc.nextLine();
        System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}",firstName));

        System.out.println("Enter your Last Name : ");
        String lastName= sc.nextLine();
        System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}",lastName));
    }
}