package edu.ginger.hacker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class CountingValleysTest {

    @Test
    public void test1() {
        assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
    }
}
