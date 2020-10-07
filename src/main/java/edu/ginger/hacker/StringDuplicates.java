package edu.ginger.hacker;

import java.util.Arrays;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class StringDuplicates {

    static String duplicates(String a) {

        char[] ca = a.toCharArray();
        int n = ca.length - 1;
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (ca[i] == ca[j]) {
                    break;
                }

                if (j == i) {
                    ca[index++] = ca[i];
                }
            }
        }
        return String.valueOf(Arrays.copyOf(ca, index));
    }

    public static void main(String[] arg) {
        System.out.println(duplicates("abcabc"));
        System.out.println(duplicates("geeeekszooone"));
    }
}
