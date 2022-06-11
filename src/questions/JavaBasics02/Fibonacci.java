package questions.JavaBasics02;


import java.util.Scanner;

// Write a Java method to print Fibonacci series of n terms where n is argument passed by user.
// Fibonacci series -: 0 1 1 2 3 5 8
public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series till : " + number);
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                System.out.print(first + ", ");
            } else {
                int temp;

                temp = first;
                first = second;
                second = temp + first;

                System.out.print(first + ",");

            }
        }

    }

}
