package org.example;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        int five = 7;
        System.out.println("Hello Neo.");
        System.out.println("Folow the white cat...");
        System.out.println(five);
Scanner scanner = new Scanner(System.in);

System.out.println("Please enter your name");
String userName = scanner.nextLine();
System.out.println("Nice to meet you, " + userName + "!");

System.out.println("Please Enter your age:");
int userAge = scanner.nextInt();

if (userAge < 0 ){
    System.out.println("Invalid data");
    return;
}
        if (userAge < 18){
            System.out.println(userName + " is not allowed to drink!");
        }else {
            System.out.println("Cheers, " + userName);
        }
    }
}
