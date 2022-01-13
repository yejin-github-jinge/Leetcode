package ListCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        System.out.println("hello 2022!");
        System.out.println("------------");
        //测试list
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        // 第一种遍历
        for (String str : stringList) {
            System.out.println(str);
        }
        System.out.println("-----111-------");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }


        stringList.remove("two");
        System.out.println("------222------");
        //第二种遍历
        String[] strings = new String[stringList.size()];
        stringList.toArray(strings);
        for (String string: strings) {
            System.out.println(string);
        }

        stringList.add("four");
        System.out.println("------333------");
        //第三种遍历
        Iterator iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
