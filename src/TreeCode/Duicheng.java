package TreeCode;

public class Duicheng {

     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

        public boolean isSymmetric(TreeNode root) {
            if (root != null){
                isEqual(root.left ,root.right);
            }
            return true;
        }

        public boolean isEqual(TreeNode left, TreeNode right ){
            if((left == null) && (right == null)){
                return true;
            }
            if((left == null) || (right == null)){
                return false;
            }
            if (left.val == right.val){
                return (isEqual(left.left,right.right) && isEqual(left.right , right.left));
            }else{
                return false;
            }
        }


    public static void main(String[] args) {
        Duicheng duicheng = new Duicheng();
       // duicheng.isSymmetric();
    }
}
