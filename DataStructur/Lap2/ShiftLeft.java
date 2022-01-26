package DataStructur.Lap2;

/**
 * Created by Ibrahim on 1/19/2022.
 */
public class ShiftLeft {
    public static void main(String[] args) {
            int[] array = {11,12,13,14,15};
        System.out.println("shiftLeft :");
            shiftleft(array);
            for (int i:array) {
                System.out.print(" "+i);
            }


    }

    public static int[] shiftleft(int array[]){
        int t = array[0];
        for (int i = 0; i <array.length-1 ; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = t;
        return array;
    }

}
