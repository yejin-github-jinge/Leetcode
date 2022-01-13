package year22;

import java.util.HashMap;

public class Lc1 {
    public static void main(String[] args) {
        System.out.println("one question");
        int [] nums = {2,11,15,7};
        System.out.println(Lc1.twoSum(nums,26)[0] + "   " + Lc1.twoSum(nums,26)[1]);
    }

     public static int[] twoSum(int[]  nums, int target) {
         int[] result =  new int[2];
         HashMap hashMap = new HashMap();


         for (int i = 0; i < nums.length; i++) {
             if(i == 0){
                hashMap.put(nums[i],i);
             }else {
                 if(hashMap.containsKey(target - nums[i])){
                     result[0] = (int)hashMap.get(target - nums[i]);
                     result[1] = i;
                     return result;
                 }else {
                     hashMap.put(nums[i],i);
                 }
             }
         }

        return result;
    }
}
