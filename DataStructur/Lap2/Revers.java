package DataStructur.Lap2;

import java.util.Arrays;

/**
 * Created by Ibrahim on 1/19/2022.
 */
public class Revers {
    public static void main(String[] args) {
        int[] array = {11,12,13,14,15};
        revers(array);
        System.out.print(Arrays.toString(array));
        My.Methods.fillArray(array);
        System.out.print(Arrays.toString(array));

    }

    public static int[] revers(int[] array){
        for (int i=0;i<array.length/2;i++){
            int temp = array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
