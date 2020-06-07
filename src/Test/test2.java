package Test;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.out;

public class test2 {

    static class  TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode(){
        }
        TreeNode(int value){
            this.value = value;
        }
    }

    public static  boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int left =  maxDeep(root.left) ;
        int right = maxDeep(root.right);
        if(Math.abs(left -right) > 1){
            return false;
        }else{
            return true;
        }
    }

    public static int maxDeep(TreeNode root){

        if(root == null){
            return 0;
        }

        int left  = maxDeep(root.left) + 1;
        int right = maxDeep(root.right) + 1;
        return Math.max(left,right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode treeNode = new TreeNode(9);
        TreeNode treeNode1 = new TreeNode(20);
        TreeNode treeNode2 = new TreeNode(15);
        TreeNode treeNode3 = new TreeNode(7);
        root.left = treeNode;
        root.right = treeNode1;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        //isBalanced(root);
        //levelTrave(root);
        //test queue
    }

    public static void testQueue(){
        Queue queue = new LinkedList<>();



    }

    public static void levelTrave(TreeNode root){

        if(root == null){
            return ;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = 0;

        while(queue.peek() != null){
            size = queue.size();

            while(size > 0){
                TreeNode tree = queue.poll();
                System.out.println(tree.value);
                if (tree.left != null){
                    queue.offer(tree.left);
                }
                if (tree.right != null){
                    queue.offer(tree.right);
                }
                size--;
            }
        }
    }
}
