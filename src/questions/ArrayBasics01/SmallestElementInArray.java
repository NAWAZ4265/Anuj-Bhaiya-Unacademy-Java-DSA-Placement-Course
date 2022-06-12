package questions.ArrayBasics01;


import java.util.Scanner;

// Find the smallest element in the given Array.
public class SmallestElementInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.print("Enter the element of array : ");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            numbers[i] = element;
        }

        int min = numbers[0];

        for (int i = 1; i < size; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println("Smallest element in araay is : " + min);

    }

}
