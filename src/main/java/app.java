/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        String username, password, output;
        final String correctPassword = "abcd1234";

        System.out.println("Enter username:");
        scan = new Scanner(System.in);
        username = scan.next();

        System.out.println("Enter password:");
        scan = new Scanner(System.in);
        password = scan.next();

        if(password.equals(correctPassword))
        {
            output = "Welcome!";
        }
        else
        {
            output = "I don’t know you.";
        }

        System.out.println(output);
    }
}