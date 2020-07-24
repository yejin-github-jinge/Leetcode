package StringCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringToInteger {

    public static void main(String[] args) {
        String str = " +- 91 2 3 6 5 ";
        String str2 = str.replace(" ","");
        String first = str2.substring(0,1);
        if(first.equals("+") || first.equals("-") || Integer.valueOf(first) != -1) {
            System.out.println(first);
        }

        ThreadLocal<?> threadLocal = null;
        Map map = null;
        Object o = 2;
       // threadLocal.set();
        //System.out.println(threadLocal.get());

        List list  =  new ArrayList<>();


        Map ma = new HashMap<>();
        ma.put(1,2);
        ma.put(2,3);
        System.out.println(ma.get(1));


    }

    public int myAtoi(String str) {
        String temp = str.replace(" ","");
        if(temp.length() == 0)
            return 0;
        String first = temp.substring(0,1);
        if(first.equals("+") || first.equals("-") || Integer.valueOf(first) != -1) {

        }





        return 0;
    }
}
