package com.salgaonkar.inorder.tree.traversal;

public class Node {

    int data;

    Node left, right;

    // Function to create a new Binary Tree Node having a given key.
    public Node(int key) {
        data = key;
        left = right = null;
    }
}
