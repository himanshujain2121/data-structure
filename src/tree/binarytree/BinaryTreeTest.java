package tree.binarytree;

import tree.Node;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTest {
    public void preOrder(Node root){
        System.out.print(root.getKey()+", ");
        if(root.getLeft() != null){
            preOrder(root.getLeft());
        }
        if(root.getRight() != null){
            preOrder(root.getRight());
        }
    }

    public void inOrder(Node root){
        if(root.getLeft() != null){
            inOrder(root.getLeft());
        }
        System.out.print(root.getKey()+", ");
        if(root.getRight() != null){
            inOrder(root.getRight());
        }
    }

    public void postOrder(Node root){
        if(root.getLeft() != null){
            postOrder(root.getLeft());
        }
        if(root.getRight() != null){
            postOrder(root.getRight());
        }
        System.out.print(root.getKey()+", ");
    }

    public void levelOrder(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node node = que.poll();
            System.out.print(node.getKey()+",");
            if(node.getLeft() != null){
                que.add(node.getLeft());
            }
            if(node.getRight() != null){
                que.add(node.getRight());
            }
        }
    }

    public int height(Node root){
        if(root == null){
            return 0;
        }
        int lmax = height(root.getLeft());
        int rmax = height(root.getRight());
        return Math.max(lmax,rmax) + 1;
    }

    public void spiralOrderTraversal(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        Node node = s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node temp = s1.pop();
                System.out.print(temp.getKey() + ", ");
                if(temp.getLeft() != null){
                    s2.push(temp.getLeft());
                }
                if(temp.getRight() != null){
                    s2.push(temp.getRight());
                }
            }
            while(!s2.isEmpty()){
                Node temp = s2.pop();
                System.out.print(temp.getKey()+", ");
                if(temp.getRight() != null){
                    s1.push(temp.getRight());
                }
                if(temp.getLeft() != null){
                    s1.push(temp.getLeft());
                }
            }
        }

    }

    public int size(Node root){
        if(root == null){
            return 0;
        }
        return size(root.getLeft()) + size(root.getRight()) + 1;
    }

    public int maxValue(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int leftMax = maxValue(root.getLeft());
        int rightMax = maxValue(root.getRight());
        return Math.max(root.getKey(),Math.max(leftMax,rightMax));
    }

    public int minValue(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int leftMin = minValue(root.getLeft());
        int rightmin = minValue(root.getRight());
        return Math.min(root.getKey(),Math.min(leftMin,rightmin));
    }

}
