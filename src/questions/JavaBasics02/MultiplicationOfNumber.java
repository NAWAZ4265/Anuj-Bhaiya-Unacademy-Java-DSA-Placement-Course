package questions.JavaBasics02;


import java.util.Scanner;

// Write a Java program that takes a number as input and prints its multiplication table up to 10.
public class MultiplicationOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

    }

}
