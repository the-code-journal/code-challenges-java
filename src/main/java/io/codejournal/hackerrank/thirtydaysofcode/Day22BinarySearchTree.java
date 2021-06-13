package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day22BinarySearchTree {

    public static void main(final String args[]) {

        String input = "7 3 5 2 1 4 6 7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final int testcases = scanner.nextInt();

        final int[] values = new int[testcases];

        int index = 0;

        while (index < testcases) {
            values[index++] = scanner.nextInt();
        }

        scanner.close();

        new Day22BinarySearchTree().run(values);
    }

    public void run(final int[] values) {

        final BinaryTree tree = new BinaryTree();

        Arrays.stream(values).forEach(tree::insert);

        final int height = tree.getHeight();

        System.out.println(height);
    }
}

class BinaryTree {

    private BinaryTreeNode root;

    public void insert(final int data) {
        insert(root, data);
    }

    private BinaryTreeNode insert(final BinaryTreeNode node, final int data) {

        if (node == null) {

            final BinaryTreeNode newNode = new BinaryTreeNode(data);

            if (root == null) {
                root = newNode;
            }

            return newNode;

        } else {

            BinaryTreeNode current;

            if (data <= node.data) {
                current = insert(node.left, data);
                node.left = current;
            } else {
                current = insert(node.right, data);
                node.right = current;
            }

            return node;
        }
    }

    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(final BinaryTreeNode node) {

        if (node == null) {
            return -1;
        }

        return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
    }

    public void levelOrderTraversal() {
        levelOrderTraversal(root);
    }

    private void levelOrderTraversal(final BinaryTreeNode node) {

        final Queue<BinaryTreeNode> levelOrder = new LinkedList<>();

        levelOrder.add(node);

        final StringBuilder levelOrderTraversal = new StringBuilder();

        while (!levelOrder.isEmpty()) {

            final BinaryTreeNode currentNode = levelOrder.peek();

            levelOrderTraversal.append(currentNode.data + " ");

            if (currentNode.left != null) {
                levelOrder.add(currentNode.getLeft());
            }

            if (currentNode.right != null) {
                levelOrder.add(currentNode.getRight());
            }

            levelOrder.remove();
        }

        System.out.println(levelOrderTraversal.toString().trim());
    }
}

class BinaryTreeNode {

    BinaryTreeNode left;

    BinaryTreeNode right;

    public int data;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }
}
