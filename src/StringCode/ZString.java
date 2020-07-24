package StringCode;

import java.util.ArrayList;
import java.util.List;

public class ZString {

    public static void main(String args []){
        String str = convert("LEETCODEISHIRING",3);
        String str1 = "LCIRETOESIIGEDHN";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str.equals(str1));

        int a = 123;
        System.out.println(123%10);
    }

    public static String convert(String s, int numRows) {
        int length = s.length();
        if(s.length() == 0 || numRows <= 1 ){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        List<StringBuilder> list = new ArrayList<>();
        for(int i = 0;i < numRows ; i++){
            list.add(new StringBuilder());
        }
        char[] arr = s.toCharArray();
        int count = 0;
        boolean flag = true;

        for (int i = 0; i < length; i++) {
            list.get(count).append(arr[i]);
            if(count < numRows - 1 && flag){
                count++;
                flag = true;
            }else if(count == numRows - 1 && flag){
                count--;
                flag = false;
            }else if (count < numRows - 1 && !flag){
                if(count == 0){
                    flag = true;
                    count++;
                }else{
                    count--;
                    flag = false;
                }
            }
        }

        for(StringBuilder stringBuilder1 : list){
            stringBuilder.append(stringBuilder1);
        }

        return stringBuilder.toString();
    }
}
