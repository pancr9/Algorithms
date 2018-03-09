package com.company;

/**
 * Sample program to demonstrate and print:
 * inorder traversal
 * preorder traversal
 * postorder traversal.
 * level order traversal
 * leaf nodes
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

        System.out.println("\nLevel Order traversal of the binary tree is ");
        tree.printLevelOrder(tree.root);

        System.out.println("\nLeaf Nodes of the binary tree is ");
        tree.printLeafNodes(tree.root);
    }
}
