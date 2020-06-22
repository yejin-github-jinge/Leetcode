package Sort;

public class SelectSort {

    public static void main(String[] args) {

        //select sort
        int [] array = { 6, 3, 5, 7, 0, 4, 1, 2 };
//        for(int i = 0 ; i < array.length - 1 ;i++){
//            int min = i;
//            for(int j = i+1; j < array.length  ;j++){
//               if(array[min] > array[j]){
//                   min = j;
//               }
//            }
//            if(min != i){
//                int temp = array[min];
//                array[min] = array[i];
//                array[i] = temp;
//            }
//        }

        //select sort  reverse
        for(int i = 0 ; i < array.length - 1 ;i++){
            int max = i;
            for(int j = i+1; j < array.length  ;j++){
                if(array[max] < array[j]){
                    max = j;
                }
            }
            if(max != i){
                int temp = array[max];
                array[max] = array[i];
                array[i] = temp;
            }
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }




    }
}
