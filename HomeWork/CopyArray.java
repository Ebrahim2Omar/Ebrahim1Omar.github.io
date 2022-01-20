package HomeWork;

import java.util.Arrays;

/**
 * Created by Ibrahim on 1/20/2022.
 */
public class CopyArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int [] arrCopy = new int[array.length];

        copy(array,arrCopy);
        System.out.println(Arrays.toString(arrCopy));
    }

    public static int [] copy(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
//        arr2 = arr1;
        return arr2;
    }
}
