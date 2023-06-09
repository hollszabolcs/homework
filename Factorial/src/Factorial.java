import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give a number");
        long number = scanner.nextLong();
        long countNumber = 1;
        long sumNumber = number;

        //Eloltesztelo

        while (number > 1) {
            for (int i = 1; number >= i; i++) {
                countNumber *= number;
                number -= 1;
                System.out.println(countNumber);
                if (1 > number) {
                    break;
                }
            }
        }
        System.out.println("the factorial of " + sumNumber + " is " + countNumber);


        //Hatultesztelo

   /*     do {


            for (int i = 1; number >= i; i++) {
                countNumber *= number;
                number -= 1;
                System.out.println(countNumber);
                if (1 > number) {
                    break;
                }
            }
        } while (number > 1);
        System.out.println("the factorial of " + sumNumber + " is " + countNumber);*/

        //for

        /*or (int i = 1; number >= i; i++) {
            countNumber *= number;
            number -= 1;
            System.out.println(countNumber);
            if (1 > number) {
                break;
            }
        }
        System.out.println("the factorial of " + sumNumber + " is " + countNumber);*/

    }
}

