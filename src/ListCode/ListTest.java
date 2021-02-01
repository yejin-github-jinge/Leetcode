package ListCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.size());
        list.add(1);
        list.add("123");
        list.add(1.23);
        list.add('a');
        System.out.println(list.toArray());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        Iterator iterator = list.iterator();
//        for (;iterator.hasNext();) {
//            System.out.println(iterator.next());
//        }

        for (Object o : list
             ) {
            System.out.println(o);
        }

        list.forEach( lists -> System.out.println(lists));
    }
}
