package com.company;

/**
 * Model class for binary tree.
 */
class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    /**
     * Function to print inorder traversal for input node.
     *
     * @param node current input node
     */
    void printInorder(Node node) {

        if (node == null) return;

        //Recurring on left child
        printInorder(node.left);

        //Root node
        System.out.print(node.key + " ");

        //Recurring on right child
        printInorder(node.right);

    }

    /**
     * Function to print post order traversal for input node.
     *
     * @param node current input node
     */
    void printPostOrder(Node node) {
        if (node == null) return;

        //Recurring on left child
        printPostOrder(node.left);

        //Recurring on right child
        printPostOrder(node.right);

        //Root node
        System.out.print(node.key + " ");

    }

    /**
     * Function to print pre order traversal for input node.
     *
     * @param node current input node
     */
    void printPreOrder(Node node) {
        if (node == null) return;

        //Root node
        System.out.print(node.key + " ");

        //Recurring on left child
        printPreOrder(node.left);

        //Recurring on right child
        printPreOrder(node.right);
    }
}
