package StringCode;

/*
* 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
* 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
            String replaceStr = str.toString().replace(" ", "%20");
            return replaceStr;
* */

public class ReplaceBlack {

        public static String replaceSpace(StringBuffer str) {

            System.out.println(str.length());
            char[] chars = str.toString().toCharArray();
            StringBuffer stringBuffer = new StringBuffer();

            for (char chartemp : chars) {
                if (chartemp == ' ') {
                    stringBuffer.append("%20");
                } else {
                    stringBuffer.append(chartemp);
                }
            }
            System.out.println(stringBuffer.charAt(1));
            return stringBuffer.toString();
        }

        public static void main (String[] args){
            System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
        }
}
