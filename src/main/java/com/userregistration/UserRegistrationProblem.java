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

        System.out.println("Enter your email Id : ");
        String emailId= sc.nextLine();
        System.out.println(Pattern.matches("^[0-9A-Za-z]+(([._+-]?)[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$", emailId));

        System.out.println("Enter your Mobile Number : ");
        String mobileNumber= sc.nextLine();
        System.out.println(Pattern.matches("(91\\s)?[6-9][0-9]{9}$",mobileNumber));

        System.out.println("Enter your Password : ");
        String password= sc.nextLine();
        System.out.println(Pattern.matches("[a-zA-Z]{8,}",password));

        System.out.println("Enter your Password : ");
        String upperPassword= sc.nextLine();
        System.out.println(Pattern.matches("[A-Z]+[a-z]{8,}",upperPassword));
    }
}