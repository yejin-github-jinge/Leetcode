package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(3);
        list1.add(9);
        list1.add(20);
        list2.add(15);
        list2.add(7);
        listList.add(list);
        listList.add(list1);

        listList.add(list2);

        System.out.println(listList);
        Collections.reverse(listList);
        System.out.println(listList);

        System.out.println(5/2);
    }
}
