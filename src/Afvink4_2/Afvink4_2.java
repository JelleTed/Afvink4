package Afvink4_2;

import java.util.LinkedList;
import java.util.Queue;

public class Afvink4_2 {


    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }

    // Recursive Solution
    public void preOrder(TreeNode root) {
        if(root !=  null) {
            //Visit the node-Printing the node data
            System.out.printf("%d ",root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    public static void main(String[] args)
    {
        Afvink4_2 bi=new Afvink4_2();
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Preorder:");

        bi.preOrder(rootNode);

        System.out.println();
        System.out.println("Postorder:");

        bi.postOrder(rootNode);

        System.out.println();
        System.out.println("In order:");

        bi.inOrder(rootNode);

        System.out.println();
        System.out.println("Level order:");

        bi.levelOrderTraversal(rootNode);
    }

    public static TreeNode createBinaryTree()
    {

        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;
    }




    public void postOrder(TreeNode root) {
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%d ",root.data);
        }
    }

    public void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.printf("%d ",root.data);
            inOrder(root.right);
        }
    }

    public static void levelOrderTraversal(TreeNode startNode){
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(startNode);
        while(!queue.isEmpty()) {
            TreeNode tempNode=queue.poll();
            System.out.printf("%d ",tempNode.data);
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }


    }

}