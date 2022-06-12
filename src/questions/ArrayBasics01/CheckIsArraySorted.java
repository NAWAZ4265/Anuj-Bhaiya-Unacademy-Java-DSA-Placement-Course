package questions.ArrayBasics01;


import java.util.Scanner;

// Check if the Array is Sorted
public class CheckIsArraySorted {

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

        boolean isSorted = true;

        for (int i = 0; i < size - 1; i++) {

            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted!!");
        } else {
            System.out.println("Array is not sorted!!");
        }

    }

}
