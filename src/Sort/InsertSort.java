package Sort;

public class InsertSort {

    public static void main(String[] args) {
        int [] array = { 6, 3, 5, 7, 0, 4, 1, 2 };
        //insert sort
//        for(int i = 0 ; i < array.length ;i++){
//            for(int j = i; j > 0 ;j--){
//                if(array[j] < array[j - 1]){
//                    int temp = array[j];
//                    array[j] = array[j-1];
//                    array[j-1] = temp;
//                }else{
//                    break;
//                }
//            }
//        }

        //Insert sort reverse
        for(int i = 0;i < array.length ; i++){
            for(int j = i;j > 0;j--){
                if(array[j] > array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        //对于未排序的一个数据，在已排序序列中从后向前扫描，找到相应的位置并插入
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
