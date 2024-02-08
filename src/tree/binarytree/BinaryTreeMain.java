package tree.binarytree;

import tree.Node;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeMain {

    public static void main(String[] args) {

        // create simple Binary tree
        // 1,2,3,4,5,6
        /*
                1
               / \
              2   3
              /\  /\
             4 5
            /
           6

         */
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.setLeft(new Node(2));
        bt.root.setRight(new Node(3));
        bt.root.getLeft().setLeft(new Node(4));
        bt.root.getLeft().setRight(new Node(5));
        bt.root.getLeft().getLeft().setLeft(new Node(6));


        // traverse a binary tree preorder, inorder,postorder
        System.out.print("Binary Tree preorder = ");
        bt.preOrder(bt.root);
        System.out.println();

        System.out.print("Binary Tree inorder = ");
        bt.inOrder(bt.root);
        System.out.println();

        System.out.print("Binary Tree postorder = ");
        bt.postOrder(bt.root);
        System.out.println();
        // find an element in a tree level order traversal

        // traverse using level order or breadth first search

        System.out.print("Binary Tree levelorder or breadth first search= ");
        bt.levelOrder(bt.root);

        //Height of Binary tree
        System.out.println();
        int height = bt.height(bt.root);
        System.out.println("height of tree = "+height);

        // find path of a node
        int value = 5;
        List<Integer> ll = bt.findPath(bt.root,value,new ArrayList<>());
        System.out.println("find path of a node : "+ value+", = "+ll);

        // spiral order traversal
        bt.spiralOrder(bt.root);

        // size of a binary tree
        System.out.println();
        int sizeOfTree= bt.size(bt.root);
        System.out.println("size of tree = "+sizeOfTree);

        // Max and min value in binary tree
        int maxValue = bt.maxValueInBinaryTree(bt.root);
        System.out.println("max value = "+maxValue);
        int minValue = bt.minValueInBinaryTree(bt.root);
        System.out.println("min value = "+minValue);
    }
}
