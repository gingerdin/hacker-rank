package edu.ginger.hacker;

import org.junit.Test;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class BinaryTreeTest {

    @Test
    public void test() {
        BinaryTree tree = BinaryTree.create(new int[]{1,2,3,4,5,6,7,8,9,10});

        tree.toString();
    }
}
