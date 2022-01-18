package year22;

import java.util.ArrayList;
import java.util.List;

public class Lc3 {

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        if(s.trim().length() == 0 || s.length() == 1){
            return 1;
        }

       char[] chars = s.toCharArray();
       int start = 0;
       int end = chars.length -1 ;
       List<StringBuilder> list = new ArrayList<>();

       StringBuilder stringBuilder = null;
        for (; start < chars.length; start++,end--) {
            if (start < end ){

            }

        }

        return 0;
    }
}
