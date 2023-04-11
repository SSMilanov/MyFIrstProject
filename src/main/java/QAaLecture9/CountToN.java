package QAaLecture9;

import java.util.Scanner;

public class CountToN {

    public static void main(String[] args) {

     printToN();

    }
   public static void printToN() {

    Scanner nScan = new Scanner(System.in);
    System.out.println(" Enter a number for n\n");
    int n = nScan.nextInt();

    System.out.printf("The numbers from %d to are: \n",n);
    for (int i = 1; i < n; i++) {
        System.out.println(i);
    }

}
}