package QaLecture6;

import java.awt.*;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class HwFromLecture6 {
    public static void main(String[] args) {
        //HW1 Area and Perimeter of a rectangle.
        System.out.println("Homwework Q1");
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете височина на правоъгълника (Height)");
        double height = input.nextDouble();

        System.out.println("Въведете дължина на правоъгълника (Length)");
        double length = input.nextDouble();
        //Лице на правоъгълник S = a.b
        // Периметър P = 2(a=b)
        double area = height * length;
        double perimeter = 2*(length*height);

        System.out.println("Лицето на правоъгълника е :" + area);
        System.out.println("Периметърът на правоъгълника е :" + perimeter);

        //HW2 Odd or even numbers
        System.out.println("Homwework Q2");

        Scanner number = new Scanner(System.in);
        System.out.println("Моля въведете число.");
        int num = number.nextInt();

        if( num % 2 == 0)
            System.out.println("Числото " + num + " е четно.");
        else
            System.out.println("Числото " + num + " е нечетно. ");

        //HW3 Number to weekdays
        System.out.println("Homwework Q3");

        Scanner weekdaynumber = new Scanner(System.in);
        System.out.println("Моля въведете номер между 1-7");
        byte weekDNumber = weekdaynumber.nextByte();
        if (weekDNumber <= 0 && weekDNumber >=8) {
            System.out.println("Invalid number entered.");}

        if (weekDNumber == 1)
            System.out.println("You have selected " + weekDNumber + " Day of the week is Monday.");
        if (weekDNumber == 2)
            System.out.println("You have selected " + weekDNumber + " Day of the week is Tuesday.");
        if (weekDNumber == 3)
            System.out.println("You have selected " + weekDNumber + " Day of the week is Wednesday.");
        if (weekDNumber == 4)
            System.out.println("You have selected " + weekDNumber + " Day of the week is Thursday.");
        if (weekDNumber == 5)
            System.out.println("You have selected " + weekDNumber + " Day of the week is Friyay!.");
        if (weekDNumber == 6)
            System.out.println("You have selected " + weekDNumber + " Day of the week is Saturday.");
        if (weekDNumber == 7)
            System.out.println("You have selected " + weekDNumber + " Day of the week is Sunday.");


        // Using Switch
public static void whichDayOfTheWeek(byte day)

        Scanner dayofweek = new Scanner(System.in);
        System.out.println("Please enter a number between 1-7");
        byte weekday = dayofweek.nextByte();

        switch (day){

            case 1:
                System.out.println("You have selected " + weekday + " Day of the week is Monday.");
            case 2:
                System.out.println("You have selected " + weekday + " Day of the week is Tuesday.");
            case 3:
                System.out.println("You have selected " + weekday + " Day of the week is Wednesday.");
            case 4:
                System.out.println("You have selected " + weekday + " Day of the week is Thursday.");
            case 5:
                System.out.println("You have selected " + weekday + " Day of the week is FriYay!.");
            case 6:
                System.out.println("You have selected " + weekday + " Day of the week is Saturday.");
            case 7:
                System.out.println("You have selected " + weekday + " Day of the week is Sunday.");
            default:
                System.out.println("Invalid entry.");
        }


    }
}
