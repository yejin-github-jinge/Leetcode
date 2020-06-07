package Test;


import java.util.Arrays;

public class Test1 {

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

      static  public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }

    public static TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        if (length == 0){
            return null;
        }
        int mid = length/2;
        TreeNode tree = new TreeNode(nums[mid]);
        if (mid == 0){
            return tree;
        }
        tree.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        if (mid != length - 1){
            tree.right = sortedArrayToBST(Arrays.copyOfRange(nums,mid+1 ,length));
        }else{
            tree.right = null;
        }
        return tree;
    }

    public static void main(String[] args) {
        int []nums = {-10,-3,0,5,9};
        sortedArrayToBST(nums);
        System.out.println("-----------------");
        ListNode listNode = new ListNode(-10);
        ListNode listNode1 = new ListNode(-3);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(9);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(sortedListToBST(listNode));
    }


    public static TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }

        int length = 0;
        ListNode temp = head;

        do{
            temp = temp.next;
            length++;
        }while(temp != null);


        int [] intnums = new int[length];
        int i = 0;
        do{
            intnums[i] = head.val;
            head = head.next;
            i++;
        }while(head != null);

        return helper_tree(intnums);
    }

    public static TreeNode helper_tree(int [] intnums){
        int length = intnums.length;
        int mid = length/2;
        TreeNode tree = new TreeNode(intnums[mid]);
        if(mid == 0){
            return tree;
        }

        tree.left = helper_tree(Arrays.copyOfRange(intnums,0,mid));
        if (mid != length -1){
            tree.right = helper_tree(Arrays.copyOfRange(intnums,mid+1,length));
        }else{
            tree.right = null;
        }

        return tree;

    }

}
