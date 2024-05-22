package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        int[] arr = {2, 8, 7, 1, 3, 5, 6, 4};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}