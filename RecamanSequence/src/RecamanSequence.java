import java.util.Scanner;

public class RecamanSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long want do you go in recaman sequence?");
        int number = scanner.nextInt();
        int recaman = 0;
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            if (recaman - i > 0) {
                recaman -= i;
                for (int recamannumber : array) {
                    if (recamannumber == recaman) {
                        recaman += i;
                    }
                }
                array[i] = recaman;
                System.out.println(array[i]);
            } else {
                recaman += i;
                array[i] = recaman;
                System.out.println(array[i]);
            }
        }
    }
}
