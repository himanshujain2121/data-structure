package tree.binarysearchtree;

import tree.Node;

public class BinarySearchTree {
    Node root;

   public Node add(Node root,int value){
        if(root == null){
            return new Node(value);
        }
        if(value < root.getKey()){
            root.setLeft(add(root.getLeft(),value));
        }
        if(value > root.getKey()){
            root.setRight(add(root.getRight(),value));
        }
        return root;
   }

   public void inOrder(Node root){
       if(root != null){
           inOrder(root.getLeft());
           System.out.print(root.getKey()+", ");
           inOrder(root.getRight());
       }
   }

   // Left < Root < Right
    public Boolean isValid(Node root) {
        if(root == null){
            return true;
        }
        if(root.getLeft() != null){
            if(maxValue(root.getLeft()) > root.getKey()){
                return false;
            }
        }
        if(root.getRight() != null){
            if(minValue(root.getRight()) < root.getKey()){
                return false;
            }
        }
        return isValid(root.getLeft()) && isValid(root.getRight());
    }

    private int minValue(Node root) {
       if(root == null){
           return Integer.MAX_VALUE;
       }
       return Math.min(root.getKey(),Math.min(minValue(root.getLeft()),minValue(root.getRight())));
    }
    private int maxValue(Node root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.getKey(),Math.max(maxValue(root.getLeft()),maxValue(root.getRight())));
    }

    public Boolean searchElement(Node root, int value) {
       if(root == null){
           return false;
       }
       if(root.getKey() == value){
           return true;
       }
       if(root.getLeft() != null && root.getKey() >= value){
           return searchElement(root.getLeft(),value);
       }
       if(root.getRight() != null && root.getKey() <= value){
           return searchElement(root.getRight(),value);
       }
       return false;
    }


}
