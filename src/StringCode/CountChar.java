package StringCode;

public class CountChar {
    //balloon
    public static int maxNumberOfBalloons(String text) {
        if(text == null){
            return 0;
        }
        int countA = 0;
        int countB = 0;
        int countL= 0;
        int countO = 0;
        int countN = 0;

        char[] chars = text.toCharArray();
        for(char charTemp : chars){
            switch(charTemp){
                case 'a':
                    countA++;
                    break;
                case 'b':
                    countB++;
                    break;
                case 'l':
                    countL++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'n':
                    countN++;
                    break;
                    default:break;
            }
        }

        int [] counts = {countA,countB,countL/2,countO/2,countN};
        int count = 0;
        for (int i = 0; i < counts.length - 1; i++) {
            if(counts[i] > counts[i+1]){
                count = counts[i+1];
            }else{
                count = counts[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(9^10);
        //1010 ^  1001 = 0011=3
        System.out.println(9&10);
        //1010 & 1001 = 1000=8
        System.out.println(9|10);
        //1010 | 1001=1011=11
    }

}
