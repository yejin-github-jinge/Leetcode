package year22;

import java.util.List;

//链表

public class Lc2 {
    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode();
        ListNode head = list;
        int index = 0;
        int data1 = 0;
        int data2 = 0;

        while(l1 != null || l2 != null){

            if(l1 != null){
                data1 = l1.val;
            }else{
                data1 = 0;
            }

            if(l2 != null){
                data2 = l2.val;
            }else{
                data2 = 0;
            }


            int single = data1 + data2 + index ;
            if(list != null){
                list.val = single%10;
            }else{
                list = new ListNode(single%10);
            }
            index = single/10;

            if(l1 != null){
                //ListNode list = l1.next;
                l1 = l1.next;
            }else{
                l1 = null;
            }

            if(l2 != null){
                //ListNode list = l2.next;
                l2 = l2.next;
            }else{
                l2 = null;
            }
            if (l1 != null || l2 != null){
                list.next = new ListNode();
                list = list.next;
            }
        }
        if (index != 0)
            list.next = new ListNode(index);
        return head;
    }

    public static void main(String[] args) {


        ListNode listNode = new ListNode(9);
        ListNode head = listNode;
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(9);
        listNode.next = listNode1;
        listNode = listNode1;
        listNode.next = listNode2;
        listNode = listNode2;

        ListNode tlistNode = new ListNode(9);
        ListNode head1 = tlistNode;
        ListNode tlistNode1 = new ListNode(9);
        tlistNode.next = tlistNode1;
        tlistNode = tlistNode1;


        addTwoNumbers(head,head1);

//
//        while (head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }



    }
}
