package questions.JavaBasics02;


import java.util.Scanner;

// Write a Java program to find the numbers greater than the average of the numbers of a given array.
public class NumberGreaterThanAvgOfGivenArray {

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

        int average = 0;
        for (int i = 0; i < size; i++) {
            average = average + numbers[i];
        }

        average = average / size;

        System.out.print("Elements greater than average are : ");
        for (int i = 0; i < size; i++) {
            if (numbers[i] > average) {
                System.out.print(numbers[i]+",");
            }
        }

    }

}
