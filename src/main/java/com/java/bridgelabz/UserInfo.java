package com.java.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * purpose : Use of java Regular Expression Patterns to Solve User Registration Problem.
 * @author : Rohit
 * @Since : 01-04-2022
 */
public class UserInfo {
    Scanner scanner = new Scanner(System.in);
    /*
       Added  first name method to check first name
    */
    public  boolean userFirstName(String  firstName)
    {

        boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName);
        if (result)
        {
            System.out.println("Correct");
        }
        else{
            System.out.println("Please enter valid first name : ");
        }
            return result;
    }


}
