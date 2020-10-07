package edu.ginger.hacker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class MakingAnagramsTest {

    @Test
    public void test() {
        assertEquals(4, MakingAnagrams.makingAnagrams("cde", "abc"));
    }
}
