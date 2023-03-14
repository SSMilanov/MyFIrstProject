package QA.intro;

import java.util.Scanner;

public class homework
{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Nice to meet you " + userName + "!" + " May I know your favourite hobby?");
        String  userHobby = scanner.nextLine();
        System.out.println("What a coincidence! I totally love " + userHobby + " as well!");
    }
}
