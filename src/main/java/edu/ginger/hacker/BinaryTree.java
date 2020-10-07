package edu.ginger.hacker;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class BinaryTree {

    private Node root;

    static BinaryTree create(int[] sortedArray) {
        BinaryTree tree = new BinaryTree();
        Arrays.stream(sortedArray).forEach(v -> tree.add(v));

        return tree;
    }

    private void add(int v) {
        root = addRecursive(root, v);
    }

    private Node addRecursive(Node current, int v) {
        if (current == null) {
            return new Node(v);
        }

        if (current.getValue() > v) {
            current.left = addRecursive(current.left, v);
        } else if (current.getValue() < v) {
            current.right = addRecursive(current.right, v);
        } else {
            return current;
        }
        return current;
    }


    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return value == node.value &&
                    Objects.equals(left, node.left) &&
                    Objects.equals(right, node.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, left, right);
        }
    }
}
