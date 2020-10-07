package edu.ginger.hacker;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class CountingValleys {

    static int countingValleys(int n, String s) {

        int path = 0, step = 0, valley = 0;
        for (int i = 0; i < n; i++) {
            Character character = s.charAt(i);

            if (character == 'U') {
                step = 1;
            } else {
                step = -1;
            }

            path = path + step;

            if (path == 0 && character == 'U') {
                valley++;
            }
        }
        return valley;
    }
}
