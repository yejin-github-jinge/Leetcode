package MathCode;

public class ShuLie {

    public static int Fibonacci(int n){
//        if (n == 0){
//            return 0;
//        }else if(n == 1){
//            return 1;
//        }
//        return Fibonacci(n - 1) + Fibonacci(n - 2);
//    }

//    public  int Fibonacci(int n) {
//        if (n == 0){
//            return 0;
//        }else if(n == 1){
//            return 1;
//        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }



    public  static int RectCover(int target) {
        if (target == 1 ){
            return 1;
        } else if(target == 2){
            return 2;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }

    public static void main(String[] args) {

      // System.out.println(Fibonacci(5));
        System.out.println(RectCover(5));
    }

}
