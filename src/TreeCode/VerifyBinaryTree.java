package TreeCode;

public class VerifyBinaryTree {

    static public class TreeNode {
           int val;
           TreeNode left;
           TreeNode right;
           TreeNode(int x) { val = x; }
       }

    public static boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }
        Integer min = Integer.MIN_VALUE;
        return isValid(root.left,min);
    }

    public static boolean isValid(TreeNode root,Integer min){
        if(root == null){
            return true;
        }
        isValid(root.left,min);

        if(root.val > min){
            min = root.val;
        }

        return isValid(root.right,min);
    }

    public static void main(String[] args) {

    }

}
