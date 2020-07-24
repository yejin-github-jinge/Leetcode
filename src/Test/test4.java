package Test;

import java.util.ArrayList;
import java.util.List;

public class test4 {

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
            return;
        }

        int rootIndex = 0;
        int value = root.val;
        List<Integer> leftIndex = new ArrayList<>();
        List<Integer> rightIndex = new ArrayList<>();


        for (int i = 0; i < list.size() ;i++){
            if(list.get(i) == value){
                rootIndex = i;
                break;
            }
        }


        for(int i = 0; i < rootIndex;i++){
            if(list.get(i) > value){
                leftIndex.add(list.get(i));
            }
        }

        for(int j = rootIndex + 1; j < list.size();j++){
            if(list.get(j) < value){
                rightIndex.add(list.get(j));
            }
        }

        if(leftIndex.size() == 0 && rightIndex.size() != 0){
            if(rightIndex.get(0) > rightIndex.get(1)){
                min = rightIndex.get(1);
                max = value;
            }else{
                min = rightIndex.get(0);
                max = value;
            }
        }else if (leftIndex.size() != 0 && rightIndex.size() == 0){
            if(leftIndex.get(0) > leftIndex.get(1)){
                max = leftIndex.get(0);
                min = value;
            }else{
                max = leftIndex.get(1);
                min = value;
            }

        }else if(leftIndex.size() != 0 && rightIndex.size() != 0){
            min = rightIndex.get(0);
            max = leftIndex.get(0);
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
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(2);

        root.left = left;
        left.right = right;
        recoverTree(root);
    }

}
