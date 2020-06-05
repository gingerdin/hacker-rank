package edu.ginger.hacker;

import java.util.Arrays;

/**
 *
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 *
 * For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
 *
 * Function Description
 *
 * Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
 *
 * sockMerchant has the following parameter(s):
 *
 * n: the number of socks in the pile
 * ar: the colors of each sock
 * Input Format
 *
 * The first line contains an integer , the number of socks represented in .
 * The second line contains  space-separated integers describing the colors  of the socks in the pile.
 *
 * Constraints
 *
 *  where
 * Output Format
 *
 * Return the total number of matching pairs of socks that John can sell.
 *
 * Sample Input
 *
 * 9
 * 10 20 20 10 10 30 50 10 20
 * Sample Output
 *
 * 3
 *
 * @author dlevchuk
 **/
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        if (ar == null) {
            return 0;
        }
        constrainstsValidation(n, ar);

        Arrays.sort(ar);

        int numDup = 0, duplicateCount = 0;
        int previous = -1;
        for (int i = 0; i < n; i++) {
            if (ar[i] == previous) {

                duplicateCount++;
                if (i == n - 1) {
                    numDup += (duplicateCount + 1) / 2;
                }
            } else {
                if (duplicateCount > 0) {
                    numDup += (duplicateCount + 1) / 2;
                }
                duplicateCount = 0;
                previous = ar[i];
            }

        }

        return numDup;

    }

    private static void constrainstsValidation(int n, int[] ar) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("Number of socks should be 1<= n <= 100");
        }
    }
}
