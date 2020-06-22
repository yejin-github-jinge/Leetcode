package StringCode;

import java.util.ArrayList;
import java.util.List;

public class MaxSubString {

    public static int lengthOfLongestSubstring(String s) {

        if(s.trim().isEmpty()){
            return 0;
        }
        char[] array = s.toCharArray();
        List<StringBuilder> list = new ArrayList<>();

        for(int i = 0; i < array.length;i++){
            StringBuilder stringbuilder = new StringBuilder();
            int j = i;
            while(j < array.length && !stringbuilder.toString().contains(""+ array[j])){
                stringbuilder.append(array[j]);
                j++;
            }
            list.add(stringbuilder);
        }

        int length = list.get(0).length();
        for(int m = 1 ; m < list.size(); m++){
            if(length < list.get(m).length()){
                length = list.get(m).length();
            }
        }

        return length;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
