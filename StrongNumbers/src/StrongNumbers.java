/*145 is a strong number, because 1! + 4! + 5! = 1 + 1*2*3*4 + 1*2*3*4*5 = 145.

        146 is not a strong number, because 1! + 4! + 6! does not equal to 146. 1 2 145 40585

        Write a function that takes in a number as a parameter and returns whether that number is strong or not.*/


import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        int number = scanner.nextInt();
        int length = getNumberlenght(number);
        int factor = getFactor(length);
        System.out.println(number + " " + length + " " + factor);
        /*isItStrong(number,factor)*/
    }

    public static int getNumberlenght(int number){
        String numberToString = Integer.toString(number);
        int numberOfDigits = numberToString.length();
        return  numberOfDigits;
    }
    public static int getFactor(int number){
        int factor =(int) Math.pow(2,number);
        return factor;
    }
 /*   public static int isItStrong(int number, int factor){
        for (int i = factor; i <Math.sqrt(factor) ; i++) {


        }
    }*/


    }





