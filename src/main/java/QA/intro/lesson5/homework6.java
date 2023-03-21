package QA.intro.lesson5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {

        //HW1
        System.out.println(" Homework task 1 ");
        String Name = "My name is Svetoslav";
        System.out.println(Name);
        System.out.println(Name.replace("Svetoslav", "Indigo Montoya. You killed my father. Prepare to die"));

        //HW2
        System.out.println(" Homework task 2 ");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please enter an email");
        String Email = Scanner.nextLine();
        System.out.println("Please enter the same email again");
        String SecondEmail = Scanner.nextLine();
        System.out.println(Email.equals(SecondEmail));
        if (Email.equals(SecondEmail)) {
            System.out.println(" Emails Match! ");      }
        else {
            System.out.println(" Emails Do Not Match! Please start again");     }

        //HW3
        System.out.println(" Homework task 3 ");
        System.out.println("Please enter a string of information.");
        Scanner RandomString = new Scanner(System.in);
        String EnteredString = Scanner.nextLine();
        String[] Count = EnteredString.split(" ");
        System.out.println("The string Contains " + Count.length + " words. ");

        //HW4
        System.out.println(" Homework task 4 ");
        System.out.println(Name + " " + Email);
        }
    }

