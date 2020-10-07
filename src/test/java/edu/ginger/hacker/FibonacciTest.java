package edu.ginger.hacker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class FibonacciTest {

    @Test
    public void test() {
        assertEquals(55, FibonacciSequence.fibonacci(10));
    }
}
