package Insertion_Sort;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Insertion {

    public static void onlineInsertionSort(List<Integer> sortedArr, int newValue) {
        sortedArr.add(newValue); // Append new value at end

        int j = sortedArr.size() - 2;
        while (j >= 0 && newValue < sortedArr.get(j)) {
            sortedArr.set(j + 1, sortedArr.get(j)); // Shift elements right
            j--;
        }
        sortedArr.set(j + 1, newValue); // Insert at correct position
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sortedArray = new ArrayList<>();

        System.out.println("Enter 5 numbers one at a time:");

        for (int i = 0; i < 5; i++) {
            int newValue = scanner.nextInt();
            System.out.println("Inserting: " + newValue);

            onlineInsertionSort(sortedArray, newValue);
            System.out.println("Sorted Array: " + sortedArray);
        }

        scanner.close();
    }
}
