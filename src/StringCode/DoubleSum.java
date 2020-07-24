package StringCode;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DoubleSum {

    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        System.out.println(map.get(1));
        System.out.println(map.get(7));

        System.out.println(map.keySet());
        System.out.println(map.values());

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        System.out.println(set);
        set.size();
        for(Map.Entry entry : set ){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("------------------------------");
        for(Integer key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("------------------------------");

        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    public static int[] twoSum(int[] nums, int target) {
        int[] sum = {0,0};

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){
            if(map.containsKey(target - nums[i])){
                sum[0] = i;
                sum[1] = map.get(target - nums[i]);
                break;
            }else{
                map.put(nums[i],i);
            }
        }


        return sum;
    }

}
