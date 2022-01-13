package MapCOde;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {

        System.out.println("hello hashmap");

        Map<Object,Object> map = new HashMap<>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");

        System.out.println("----111----");

        for (Object str : map.values()) {
            System.out.println("map 的 value：" + str);
        }

        System.out.println("----222----");
        for(Object str :map.keySet()){
            System.out.println("map 的 key： " + str + ", map 的 value： " + map.get(str));
        }

        System.out.println("----333----");
        for(Map.Entry<Object,Object> entry : map.entrySet()){
            System.out.println("map 的 key： " + entry.getKey() + ", map 的 value： " + entry.getValue());
        }

        System.out.println("----444----");
        Iterator<Map.Entry<Object,Object>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Object,Object> entry = iterator.next();
            System.out.println("map 的 key： " + entry.getKey() + ", map 的 value： " + entry.getValue());
        }

    }
}
