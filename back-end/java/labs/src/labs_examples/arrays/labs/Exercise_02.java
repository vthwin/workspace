package labs_examples.arrays.labs;

import java.util.Arrays;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 - 10: ");
        int input = scanner.nextInt();

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (input == array[i]) {
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("Element not found");
            return;
        }

        System.out.println("Your element is at: " + index);

    }
}