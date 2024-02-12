package tree.binarytree;

import tree.Node;

public class BinaryTreeTestMain {
    public static void main(String[] args) {
        BinaryTreeTest bt = new BinaryTreeTest();
        Node node = new Node(1);
        node.setLeft(new Node(2));
        node.setRight(new Node(3));
        node.getLeft().setLeft(new Node(4));
        node.getLeft().setRight(new Node(5));
        node.getRight().setLeft(new Node(6));
        node.getRight().setRight(new Node(7));
        node.getLeft().getLeft().setLeft(new Node(8));

        // pre order
        System.out.print("preorder = ");
        bt.preOrder(node);

        // inorder
        System.out.println();
        System.out.print("inorder = ");
        bt.inOrder(node);

        // postorder
        System.out.println();
        System.out.print("postOrder = ");
        bt.postOrder(node);

        // levelorder
        System.out.println();
        System.out.print("levelorder = ");
        bt.levelOrder(node);

        // spiral order traversal
        System.out.println();
        System.out.print("spiral order = ");
        bt.spiralOrderTraversal(node);

        // height of binary tree
        System.out.println();
        System.out.println("height of tree = "+bt.height(node.getRight()));

        // size of a binary tree
        System.out.println("size of tree = "+bt.size(node));

        // Max and min value in binary tree
        System.out.println("tree max value = "+bt.maxValue(node));
        System.out.println("tree min value = "+bt.minValue(node));

        //  find path of a node
        System.out.println("path of node = ");

        // print node at a given level

        //

    }
}
