package DataStructur.Lap2;

/**
 * Created by Ibrahim on 1/19/2022.
 */
public class ShiftRight {
    public static void main(String[] args) {
        int[] array = {11,12,13,14,15};
        shiftRight(array);
        System.out.println("\nshiftRight :");
        for (int i:array) {
            System.out.print(" "+i);
        }
    }

    public static int[] shiftRight(int array[]){
        int t = array[array.length-1];
        for (int i = array.length-1; i >=1 ; i--) {
            array[i] = array[i-1];
        }
        array[0] = t;
        return array;
    }

}
