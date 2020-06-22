package Sort;

public class MaoPaoSort {


    public static void main(String[] args) {
        int [] array = new int[]{ 6, 3, 5, 7, 0, 4, 1, 2 };
        //int [] arrays = { 6, 3, 5, 7, 0, 4, 1, 2 };
        //逆序冒泡
        for(int i= 0; i < array.length - 1; i++){
            for(int j = array.length - 1; j > i ;j--){
                if(array[j] > array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length - 1 ; i++) {
            System.out.println(array[i]);
        }


        //正序冒泡
        int[] test = { 6, 3, 5, 7, 0, 4, 1, 2 };
        for (int i = 0; i < test.length - 1; i++) {
            int a =1;
            for (int j = 0; j < test.length - i - 1; j++) {
                if (test[j] > test[j + 1]) {
                    int temp = test[j];
                    test[j] = test[j + 1];
                    test[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < test.length; k++) {
            System.out.println(test[k]);
        }
    }
}
