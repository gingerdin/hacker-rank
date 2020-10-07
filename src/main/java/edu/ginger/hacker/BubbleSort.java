package edu.ginger.hacker;

import java.util.Arrays;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class BubbleSort {

    static int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] arg) {
        Arrays.stream(sort(new int[]{10, 4 , 5, 3, 1, 7})).forEach(v -> System.out.println(v));
    }
}
