package edu.ginger.hacker;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class MakingAnagrams {


    static int makingAnagrams(String s1, String s2) {

        Map<String, Integer> alphabet = new HashMap<>();
        alphabet.put("a", 0);
        alphabet.put("b", 0);
        alphabet.put("c", 0);
        alphabet.put("d", 0);
        alphabet.put("e", 0);
        alphabet.put("f", 0);
        alphabet.put("g", 0);
        alphabet.put("h", 0);
        alphabet.put("i", 0);
        alphabet.put("j", 0);
        alphabet.put("k", 0);
        alphabet.put("l", 0);
        alphabet.put("m", 0);
        alphabet.put("n", 0);
        alphabet.put("o", 0);
        alphabet.put("p", 0);
        alphabet.put("q", 0);
        alphabet.put("r", 0);
        alphabet.put("s", 0);
        alphabet.put("t", 0);
        alphabet.put("u", 0);
        alphabet.put("v", 0);
        alphabet.put("w", 0);
        alphabet.put("x", 0);
        alphabet.put("y", 0);
        alphabet.put("z", 0);

        Map<String, Integer> alphabet1 = compute(s1, alphabet);
        Map<String, Integer> alphabet2 = compute(s2, alphabet);

        int sum = 0;

        for (Map.Entry<String, Integer> entry : alphabet1.entrySet()) {
            sum += Math.abs(alphabet1.get(entry.getKey()) - alphabet2.get(entry.getKey()));
        }

        return sum;
    }

    private static Map<String, Integer> compute(String s, Map<String, Integer> alphabet) {
        Map<String, Integer> counted = new HashMap<>(alphabet);

        for (int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            counted.computeIfPresent(letter, new BiFunction<String, Integer, Integer>() {
                @Override
                public Integer apply(String s, Integer integer) {
                    return ++integer;
                }
            });
        }
        return counted;
    }
}
