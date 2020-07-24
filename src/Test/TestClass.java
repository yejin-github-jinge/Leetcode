package Test;


//import java.util.Objects;


/*
0 new #2 <java/lang/Object>
3 dup
4 invokespecial #1 <java/lang/Object.<init>>
7 astore_1
8 return
*/

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    static class  TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(){
        }
        TreeNode(int value){
            this.val = value;
        }
    }

        public static void recoverTree(TreeNode root) {

            if(root == null){
                return;
            }
            TreeNode tree = root;
            List<Integer> list = new ArrayList<>();
            //list = midTrave(tree,new ArrayList<>());
            midTrave(tree,list);
            int min = 0;
            int max = 0;

            for(int i = 0; i < list.size() - 2;i++){
                if(list.get(i) > list.get(i + 1) && list.get(i+1) < list.get(i+2)){
                    min =  list.get(i + 1);
                    max = list.get(i);
                    break;
                }else if (list.get(i) > list.get(i + 1) && list.get(i+1) > list.get(i+2)){
                    min =  list.get(i + 2);
                    max = list.get(i);
                    break;
                }
            }

            if(list.size() == 1){
                return ;
            }else if (list.size() == 2){
                min = root.val;
                if(root.left == null){
                    max = root.right.val;
                    root.right.val = min;
                    root.val = max;
                }else{
                    max = root.left.val;
                    root.left.val = min;
                    root.val = max;
                }
            }

            midTraveSwap(root,min,max);
        }

        public static void midTraveSwap(TreeNode root,int min ,int max){
            if(root.left != null){
                midTraveSwap(root.left,min,max);
            }

            if(root.val == min){
                root.val = max;
            }else if(root.val == max){
                root.val = min;
            }

            if(root.right != null){
                midTraveSwap(root.right,min,max);
            }
        }



        public static List<Integer> midTrave(TreeNode root,List<Integer> list){
            if(root.left != null){
                midTrave(root.left,list);
            }
            list.add(root.val);
            if(root.right != null){
                midTrave(root.right,list);
            }
            return list;
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(1);
        root.left = left;



    }
}
