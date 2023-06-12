
import java.util.Scanner;

public class Factorial_reissue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, give a number");
        long number = scanner.nextLong();
        long countNumber = 1;
        long sumNumber = number;

        //Eloltesztelo

        while (number > 1) {
            countNumber *= number;
            number -= 1;
            System.out.println(countNumber);

        }
        System.out.println("the factorial of " + sumNumber + " is " + countNumber);


        //Hatultesztelo

      /*  do {
            countNumber *= number;
            number -= 1;
            System.out.println(countNumber);
        } while (number > 1);
        System.out.println("the factorial of " + sumNumber + " is " + countNumber);*/

        //for
        /*long countFor = number;

        for (int i = 1; number > i; i++) {
            countNumber *= countFor;
            System.out.println(countNumber);
            countFor -= 1;

        }
        System.out.println("the factorial of " + sumNumber + " is " + countNumber);*/
    }


}