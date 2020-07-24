package StringCode;

public class StringbuildTest {

    public static void main(String[] args) {

        int test = -123;
        if(test > 0){
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(test));
            int result = Integer.valueOf(stringBuilder.reverse().toString());
            System.out.println(result);
        }else {
            int testReverse = -test;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(testReverse));
            int result = Integer.valueOf(stringBuilder.reverse().toString());
            System.out.println(-result);
            Integer.valueOf(-result);
        }




//        StringBuilder stringBuilder= new StringBuilder("12345");
//        System.out.println(stringBuilder);
//        stringBuilder.reverse();
//        System.out.println(stringBuilder);
//        String string = "6789";
//        int addOrSub = -1;
//        addOrSub = -addOrSub;
//        System.out.println(addOrSub);
    }
}
