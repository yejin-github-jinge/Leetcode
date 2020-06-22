package StringCode;

import java.util.LinkedList;
import java.util.Stack;

public class StringReverse {


    public static  String reverseParentheses(String s) {
        if(s == null){
            return null;
        }

        char[] array = s.toCharArray();
        Stack<Integer> stack = new Stack();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < array.length;i++){
            if(array[i] == '('){
                stack.push(i);
            }else if(array[i] == ')'){
                reverse(array,stack.pop() + 1 ,i - 1);
            }
        }

        for (int i = 0; i < array.length ; i++) {
            if(array[i] != '(' && array[i] != ')'){
                stringBuilder.append(array[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static void reverse(char[] array,int start,int end){
        while(end > start){
            char temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            end--;
            start++;
        }
    }

    public static void main(String[] args) {
        String str  = "a(bcdefghijkl(mno)p)q";
        System.out.println(reverseParentheses(str));
        System.out.println(10^9);
        String test  = new String(""+'a');
        System.out.println(test.length());
        System.out.println(test);
    }
}
