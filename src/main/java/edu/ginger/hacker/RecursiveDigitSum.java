package edu.ginger.hacker;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class RecursiveDigitSum {

    static int superDigit(String n, int k) {
        n = n.chars().mapToLong(Character::getNumericValue).sum() * k + "";

        return (n.length() > 1) ? superDigit(n, 1) : Integer.valueOf(n);
    }
}
