package Test;


//import java.util.Objects;


/*
0 new #2 <java/lang/Object>
3 dup
4 invokespecial #1 <java/lang/Object.<init>>
7 astore_1
8 return
*/

public class TestClass {

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

    public static void main(String[] args) {
        TreeNode objects = new TreeNode(8);
        //Object o = new Object();
    }
}
