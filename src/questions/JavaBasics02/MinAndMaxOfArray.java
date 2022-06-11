package questions.JavaBasics02;


import java.util.Scanner;

// Write a Java program to find the maximum and minimum value of an array.
public class MinAndMaxOfArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter element of array : ");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            numbers[i] = element;
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Min value is : " + min + " and max value is : " + max);

    }

}
