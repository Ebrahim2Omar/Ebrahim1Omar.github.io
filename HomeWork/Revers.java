package HomeWork;

import java.util.Arrays;

/**
 * Created by Ibrahim on 1/20/2022.
 */
public class Revers {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        array = revers(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] revers(int[] array){
        int [] arr2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr2[array.length-i-1] = array[i];
        }
        return arr2;
    }

}
