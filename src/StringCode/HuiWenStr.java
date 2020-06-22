package StringCode;

import java.util.ArrayList;
import java.util.List;

public class HuiWenStr {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cwziydanrqvsdtvnnqgjnbrvvwxwqojeqgxhwxdoktjktulemwpbeqscbbtbfvkxsrjetfdrovcrdwzfmnnihtgxybuairswfewvpuscocqifuwylhssldpjrawqdrbvkykpaggspbfrulcktpbofchzikhzxhpocgvdbwpewpywsgqbczmamprklaoovcfecwchhmsaqkhvuvvzjblmgvqpqtnlipgqsanvovylpmxlmxvymppdykphhaamtxjnnlsqfwjwhyywgurteaummwhvavxbcpgrfffxrowluqmqjaugryxdmwvyokdcfcvcytxpixbvwrdgzctejdoaavgtezexmvxgrkpnayvfarkyoruofqmpnsqdzojxqrjsnfwsbzjmaoigytygukqlrcqaxazvmytgfghdczvzphfdbnxtklaiqqsotavdmhiaermluafheowcobjqmrkmlzyas"));
    }

    public static String longestPalindrome(String s) {
        if(s.length() == 0)
            return null;

        int length = s.length();
        char [] arr = s.toCharArray();
        String strEnd = "";
        String strStart = "";
        List<String> list = new ArrayList<>();

        for(int j = 0 ;j < length ;j++){
            for(int i = length - 1; i >= j ;i--){
                StringBuilder stringBuilder = new StringBuilder(s.substring(j,i+1));
                String str = stringBuilder.toString();
                if(stringBuilder.reverse().toString().equals(str)){
                    list.add(stringBuilder.reverse().toString());
                    break;
                }
            }
        }

        int Listlength = list.size();
        int maxLength = list.get(0).length();
        int maxIndex = 0;
        if(Listlength > 0){
            for(int k=0;k< Listlength;k++){
                if(list.get(k).length() > maxLength){
                    maxLength = list.get(k).length();
                    maxIndex = k;
                }
            }
            return list.get(maxIndex);
        }

        return null;
    }


    public static String longestPalindromeTemp(String s) {
        if(s.length() == 0){
            return  null;
        }

        int length = s.length();
        char [] arr = s.toCharArray();
        List<StringBuilder> list = new ArrayList<>();



        for(int i = 0;i < length;i++){
            StringBuilder stringBuilder = new StringBuilder();
            char temp = ' ';

            for(int j = i;j < length; j++){
                if(stringBuilder.length() > 0){
                    temp = stringBuilder.toString().charAt(0);
                }
                if(temp != ' '){
                    stringBuilder.append(arr[j]);
                    String string1 = stringBuilder.toString();
                    if(stringBuilder.reverse().toString() == string1){
                        stringBuilder.reverse();
                        continue;
                    }else{
                        stringBuilder.delete(stringBuilder.length() - 1,stringBuilder.length());
                        break;
                    }
                }else{
                    stringBuilder.append(arr[j]);
                }
            }
            list.add(stringBuilder);
        }

        int lengthList = list.size();
        if(lengthList != 0){
            int maxIndex = 0;
            int maxLength = list.get(0).length();
            for(int k = 1 ; k < lengthList;k++ ){
                if(list.get(k).length() > maxLength){
                    maxIndex = list.get(k).length();
                    maxIndex = k;
                }
            }
            return list.get(maxIndex).toString();
        }

        return null;
    }
}
