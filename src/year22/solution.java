package year22;

import StringCode.StringbuildTest;

import java.util.ArrayList;
import java.util.List;

//stringbulider string char

public class solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode head = listNode;
        int data,data1,data2,index = 0;

        while (l1 != null || l2 != null){
            data1 = (l1 != null) ? l1.val : 0;
            data2 = (l2 != null) ? l2.val : 0;
            int sum = data1 + data2 + index;
            index = sum/10;
            data = sum%10;
            //listNode = new ListNode(data);
            listNode.val = data;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

            if(l1 != null || l2 != null){
                listNode.next = new ListNode();
                listNode = listNode.next;
            }
        }
        if (index != 0) {
            listNode.next = new ListNode(index);
        }

        return head;
    }


    public static int lengthOfLongestSubstring(String s) {

        if (s == null ||  s.length() == 0){
            return 0;
        }
        if(s.trim().length() == 0){
            return 1;
        }
        List<StringBuilder> list = new ArrayList();
        char[] chars = s.toCharArray();


        for (int i = 0; i < chars.length - 1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("" + chars[i]);
            for (int j = i + 1; j < chars.length ; j++) {
                if (stringBuilder.length() != 0){
                    if (stringBuilder.toString().contains("" + chars[j])) {
                        list.add(stringBuilder);
                        break;
                    }else {
                        stringBuilder.append(chars[j]);
                    }
                }else {
                    stringBuilder.append(chars[j]);
                }
                list.add(stringBuilder);
            }
        }

        int max = 0;
        for (int i = 0; i < list.size(); i++) {
          if (list.get(i).toString().length() > max) {
              max = list.get(i).toString().length();
          }
        }

        return max;
    }


    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring(" "));
//        ListNode listNode = new ListNode(9);
//        ListNode listNode1 = new ListNode(9);
//        listNode.next = listNode1;
//
//        ListNode listNode2 = new ListNode(9);
//        ListNode listNode3 = new ListNode(9);
//        ListNode listNode4 = new ListNode(9);
//        ListNode listNode5 = new ListNode(9);
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        addTwoNumbers(listNode,listNode2);
    }

}
