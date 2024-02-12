package tree.binarysearchtree;

import tree.Node;
import tree.binarytree.BinaryTree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // 10,20,15,12,25,60,50,40
        Node root = new Node(10);
        bst.add(root,20);
        bst.add(root,15);
        bst.add(root,12);
        bst.add(root,25);
        bst.add(root,60);
        bst.add(root,50);
        bst.add(root,40);
        System.out.print("Inorder traversal = ");
        bst.inOrder(root);
        // Binary search tree validation
        System.out.println();
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.setLeft(new Node(2));
        bt.root.setRight(new Node(3));
        bt.root.getRight().setLeft(new Node(7));
        bt.root.getLeft().setLeft(new Node(4));
        bt.root.getLeft().setRight(new Node(5));
        bt.root.getLeft().getLeft().setLeft(new Node(6));
        System.out.println("Binary search tree is valid = "+bst.isValid(bt.root));

        // search in BST
        int value = 500;
        System.out.println("search element in BST value = "+value+" is present = "+bst.searchElement(root,value));

        // max and min in BST

        // deletion in BST


    }
}
