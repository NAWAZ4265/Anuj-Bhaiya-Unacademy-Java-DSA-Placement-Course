package questions.ArrayBasics01;


import java.util.Scanner;

// Reverse the given Array.
public class ReverseArray {

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

        int l = 0;
        int r = size - 1;

        while (l < r) {
            int temp;

            temp = numbers[l];
            numbers[l] = numbers[r];
            numbers[r] = temp;

            l++;
            r--;

        }

        System.out.println("Printing the array in reverse : ");
        for (int i : numbers) {
            System.out.print(i+", ");
        }

    }

}
