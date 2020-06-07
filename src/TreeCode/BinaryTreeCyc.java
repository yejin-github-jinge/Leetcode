package TreeCode;


/*输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。*/

import java.util.Arrays;

public class BinaryTreeCyc {

    public static class TreeNode {
       int value;
       TreeNode left;
       TreeNode right;

       TreeNode(int value) {
           value = value;
       }
   }


    //pre 前序遍历结果 {1,2,4,7,3,5,6,8}
    //in  中序遍历结果 {4,7,2,1,5,3,8,6}
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //前序不为空，就取出第一位作为根节点。
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
            TreeNode treeNode = new TreeNode(pre[0]);

            for (int i = 0; i < in.length ; i++) {
                if (in[i] == pre[0]) {
                    treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i + 1),Arrays.copyOfRange(in,0,i));
                    treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i + 1,pre.length ),Arrays.copyOfRange(in,i + 1,in.length));
                    break;
                }
            }


        return treeNode;
    }


    public static void main(String[] args) {

        TreeNode treeNode = reConstructBinaryTree(new int[]{1,2,4,7,3,5,6,8},new int[]{4,7,2,1,5,3,8,6});
        System.out.println(treeNode);


    }



}
