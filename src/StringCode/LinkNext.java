package StringCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/*
*          ArrayList<Integer> integerArrayList = new ArrayList<>();
        ListNode list = listNode;
        while (list != null) {
            //integerArrayList.add(list.val);
             integerArrayList.add(0,tmp.val);
            list = list.next;
        }
        * */


public class LinkNext {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        while (Objects.nonNull(listNode)) {
            //integerArrayList.add(listNode.val);
            integerArrayList.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(integerArrayList);
        return integerArrayList;
    }

   static class ListNode {
      int val;
      ListNode next = null;

     ListNode(int val) {
         this.val = val;
       }
   }

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        //listNode5.next = null;
        System.out.println(listNode1);

        System.out.println(printListFromTailToHead(listNode1));
//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        integerArrayList.add(5);
//        integerArrayList.add(4);
//        integerArrayList.add(3);
//        integerArrayList.add(2);
//        integerArrayList.add(1);
//        Collections.reverse(integerArrayList);
        //System.out.println(integerArrayList);
    }

}
