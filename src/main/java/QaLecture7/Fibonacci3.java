package QaLecture7;

import java.util.Scanner;

public class Fibonacci3 {
    public static void main(String[] args) {

        System.out.println("Enter a number for Fibonacci number count");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibonacciSeries(n);
        System.out.println();
        sumOfFibonacci(n);
    }

    private static void fibonacciSeries(int n) {
        int first = 0, second = 1, next = 0;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static int sumOfFibonacci(int n) {
        int first = 0, second = 1, next = 0, sum = 0;
        for (int i = 3; i <= n; i++) {
            next = first + second;
            second = next;
            first = second;
            sum += next;
        }
        System.out.printf("The sum of the Fibonacci numbers is %d\n",sum);
        return sum;
    }
}