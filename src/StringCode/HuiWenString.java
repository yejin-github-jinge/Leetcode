package StringCode;

public class HuiWenString {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        if(s.length() < 2)
            return s;

        int maxLength = 1;
        int begin = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < length - 1; i++){
            for(int j = i+1; j < length ; j++){
                if(j - i + 1 > maxLength && isHuiWenStr(chars,i,j)){
                    maxLength = j - i + 1;
                    begin = i;
                }
            }
        }

        if(maxLength > 0){
            return s.substring(begin,maxLength + begin);
        }

        return "";
    }

    public static boolean isHuiWenStr(char[] chars,int left, int right){
        boolean flag = false;
        while(left < right){
            if(chars[left] == chars[right]){
                left++;
                right--;
                flag = true;
            }else{
                 flag = false;
                 break;
            }
        }

        return flag;
    }

}
