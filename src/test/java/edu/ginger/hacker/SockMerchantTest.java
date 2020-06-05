package edu.ginger.hacker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class SockMerchantTest {

    @Test
    public void test1() {
        assertEquals(3, SockMerchant.sockMerchant(9, new int[]{10, 10, 10, 10, 20, 20,20, 30, 50}));
    }

    @Test
    public void test2() {
        assertEquals(4, SockMerchant.sockMerchant(10, new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3}));
    }

    @Test
    public void test1_Collection() {
        assertEquals(3, SockMerchant.sockMerchantCollection(9, new int[]{10, 10, 10, 10, 20, 20,20, 30, 50}));
    }

    @Test
    public void test2_Collection() {
        assertEquals(4, SockMerchant.sockMerchantCollection(10, new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3}));
    }
}
