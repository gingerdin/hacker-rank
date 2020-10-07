package edu.ginger.hacker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class Array2dDSTest {

    @Test
    public void test1() {
        assertEquals(19, Array2dDS.hourglassSum(new int[][]{
                new int[]{1,1,1,0,0,0},
                new int[]{0,1,0,0,0,0},
                new int[]{1,1,1,0,0,0},
                new int[]{0,0,2,4,4,0},
                new int[]{0,0,0,2,0,0},
                new int[]{0,0,1,2,4,0}}));
    }
}
