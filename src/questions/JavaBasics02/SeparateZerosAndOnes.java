package questions.JavaBasics02;


import java.util.Scanner;

// Write a Java program to separate Os on left side and 1s on right side of an array of Os and 1s in
// random order.
public class SeparateZerosAndOnes {

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

        int countZeros = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == 0) {
                countZeros++;
            }
        }

        for (int i = 0; i < countZeros; i++) {
            numbers[i] = 0;
        }

        for (int i = countZeros; i < size; i++) {
            numbers[i] = 1;
        }

        System.out.println("Printing the elements of the array : ");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

    }

}
