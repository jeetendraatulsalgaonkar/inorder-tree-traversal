package com.salgaonkar.inorder.tree.traversal;

import java.util.Stack;

public class InorderTreeTraversal {

    public static final void main(String[]main) {
        /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */

        Node root               = new Node(1);
        root.left               = new Node(2);
        root.right              = new Node(3);
        root.left.left          = new Node(4);
        root.right.left         = new Node(5);
        root.right.right        = new Node(6);
        root.right.left.left    = new Node(7);
        root.right.left.right   = new Node(8);

        System.out.println("Traversing through the tree in the recursive fashion:");
        inorder(root);
        System.out.println();
        inorderIterative(root);
    }

    // Recursive function to perform inorder traversal on the tree.
    private static void inorder(Node root) {


        // return if the root is empty
        if (root == null) {
            return;
        }

        // Traverse the left tree.
        inorder(root.left);

        // Display the data part of the root (or current node)
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Iterative function to perform inorder traversal on the tree.
    private static void inorderIterative(Node root) {

        // Starting from the root node. Set current node to root node.
        Node currentNode = root;

        // Creating an empty stack.
        Stack<Node> stack = new Stack<>();
        System.out.println("Traversing through the tree in the iterative fashion:");

        // if the current node is null and also if the stack is empty, we are done.
        while (!stack.isEmpty() || currentNode != null) {
            // If the current node exists, push it to the stack and move it to its left child.
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                // Otherwise if the current node is null, pop the stack and set the current node to its right node.
                currentNode = stack.pop();
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.right;
            }
        }
    }

}
