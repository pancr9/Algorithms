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
    
    /**
     * Function to print level order traversal for input node.
     *
     * @param node current input node
     */
    void printLevelOrder(Node node) {
        
        //Queue is an interface, hence needs a concrete class like LinkedList while declaration.
        Queue<Node> nodesQueue = new LinkedList<Node>();

        nodesQueue.add(node);
        while (!nodesQueue.isEmpty()) {

            //Remove the node head.
            Node temp = nodesQueue.poll();
            System.out.print(temp.key + " ");

            //Check for left child. Add to the queue.
            if (temp.left != null)
                nodesQueue.add(temp.left);

            //Check for left child. Add to the queue.
            if (temp.right != null)
                nodesQueue.add(temp.right);
        }
    }
    
        /**
     * Recursive Function to print leaf nodes.
     *
     * @param node input root node
     */
    void printLeafNodes(Node node) {

        if (node == null)
            return;

        if (node.right == null && node.left == null) {
            System.out.print(node.key + " ");
            return;
        }

        //Check left side
        printLeafNodes(node.left);

        //Check right side
        printLeafNodes(node.right);
    }

}
