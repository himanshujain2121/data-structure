package tree.binarytree;

import tree.Node;

import java.util.*;

public class BinaryTree {
    Node root;

    public void inOrder(Node root){
        if(root != null){
            inOrder(root.getLeft());
            System.out.print(root.getKey()+ ", ");
            inOrder(root.getRight());
        }
    }
    public void preOrder(Node root){
        if(root != null){
            System.out.print(root.getKey()+", ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    public void postOrder(Node root){
        if(root != null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getKey()+", ");
        }
    }

    public void levelOrder(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node tempNode = que.poll();
            System.out.print(tempNode.getKey()+ ", ");
            if(tempNode.getLeft() != null){
                que.add(tempNode.getLeft());
            }
            if(tempNode.getRight() != null){
                que.add(tempNode.getRight());
            }
        }
    }

    public int height(Node root){
        if(root == null){
            return 0;
        }
        int leftMax = height(root.getLeft());
        int rightMax = height(root.getRight());
        int max = Math.max(leftMax,rightMax)+1;
        return max;
    }

    public int size(Node root){
        if(root == null){
            return 0;
        }
        return size(root.getLeft()) +size(root.getRight()) + 1;
    }

    public List<Integer> findPath(Node root, Integer key, List<Integer> path){
        if(root == null ){
            return null;
        }
        path.add(root.getKey());
        if(root.getKey() == key){
            return path;
        }
        List<Integer> p = findPath(root.getLeft(),key,new ArrayList<>(path));
        if(p != null){
            return p;
        }
        return findPath(root.getRight(),key,new ArrayList<>(path));
    }

    public void spiralOrder(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node currentNode = s1.pop();
                System.out.print(currentNode.getKey() +", ");
                if(currentNode.getLeft() != null){
                    s2.push(currentNode.getLeft());
                }
                if(currentNode.getRight() != null){
                    s2.push(currentNode.getRight());
                }
            }
            while(!s2.isEmpty()){
                Node currentNode = s2.pop();
                System.out.print(currentNode.getKey() +", ");
                if(currentNode.getRight() != null){
                    s1.push(currentNode.getRight());
                }
                if(currentNode.getLeft() != null){
                    s1.push(currentNode.getLeft());
                }
            }
        }
    }

    public int maxValueInBinaryTree(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.getKey(), Math.max(maxValueInBinaryTree(root.getLeft()),maxValueInBinaryTree(root.getRight())));
    }

    public int minValueInBinaryTree(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.getKey(),Math.min(minValueInBinaryTree(root.getLeft()),minValueInBinaryTree(root.getRight())));
    }


}
