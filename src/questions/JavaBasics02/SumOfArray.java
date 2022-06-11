package questions.JavaBasics02;


import java.util.Scanner;

// Write a Java program to sum Values of an array.
public class SumOfArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            numbers[i] = element;
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of array is " + sum);

    }

}
