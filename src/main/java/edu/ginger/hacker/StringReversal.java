package edu.ginger.hacker;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class StringReversal {

    static String reverse(String str) {

        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length / 2; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[(charArr.length - 1) - i];
            charArr[(charArr.length - 1) - i] = temp;
        }
        return new String(charArr);
    }

    public static void main(String[] arg) {
        System.out.println(reverse("sineD"));
        System.out.println(reverse("emoh"));
        System.out.println(reverse("h"));
    }
}
