package com.company;

/**
 * Sample program to demonstrate inorder, preorder, and postorder traversal.
 *
 * @author Rekhansh Panchal
 */
public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node('A');

        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');

        System.out.println("\nInorder traversal of the binary tree is ");
        tree.printInorder(tree.root);

        System.out.println("\nPreorder traversal of the binary tree is ");
        tree.printPreOrder(tree.root);

        System.out.println("\nPostorder traversal of the binary tree is ");
        tree.printPostOrder(tree.root);
    }
}
