package QaLecture7;

import java.util.Scanner;

public class HWL7 {
    public static void main(String[] args) {

        System.out.println("--------- Task 1 ----------\n");
        //Creating array of 20 whole numbers and print the elements *5

        byte[] exArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //Checking array length =20
        int length = exArray.length;
        System.out.println("Array length is " + length + ".\n");

        System.out.println("Print initial array elements\n");
        for (int i : exArray) {
            System.out.printf(" %d |", i);
        }
        System.out.println("\n");

        System.out.println("Array elements multiplied by 5\n");
        for (int i : exArray) {
            System.out.printf("%d |", i * 5);
        }
        System.out.println("\n");


        System.out.println("--------- Task 2 ----------\n" + "Avg of all array numbers.\n");
        //For AVG we need sum and length avg=sum/length
        int sum = 0;

        // sum loop
        for (int i = 0; i < exArray.length; i++) {
            sum += exArray[i];
        }

        System.out.println("Sum of the array is: " + sum);

        double average = (double) sum / length; // Q: Why is this not returning 10.5 ? but 10.0 ?
        System.out.printf("Average of the array: %.5f\n", average);


        System.out.println("--------- Task 3 ----------\n" + "Sum of odd and even numbers within the array\n");

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < exArray.length; i++) {
            if (exArray[i] % 2 == 0) {
                sumEven += exArray[i];
            } else {
                sumOdd += exArray[i];
            }
        } // NOTE - Important to close the loop before printing info, as otherwise it will print on every loop.
        System.out.println("The sum of the even numbers is: " + sumEven);
        System.out.println("The sum of the odd numbers is: " + sumOdd);


        System.out.println("--------- Task 4 ----------\n" + "Print numbers from 1 - n when called from a method \n");



         }


    }




