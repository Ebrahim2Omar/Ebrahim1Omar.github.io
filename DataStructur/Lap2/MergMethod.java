package DataStructur.Lap2;

/**
 * Created by Ibrahim on 1/15/2022.
 */
public class MergMethod {
    public static void main(String[] args) {
        int [] array1={1,2,3,9,7};
        int [] array2={4,5,6,7};
        int [] array = merg(array1,array2);
        System.out.print("{");
        for (int i:array) {
            System.out.print(" "+i);
        }
        System.out.print(" }");
    }

    public static int [] merg(int[] array1, int[] array2){
        int [] totalArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            totalArray[i] = array1[i];
        }

        for (int i = array1.length, j=0; i < totalArray.length; i++, j++) {
            totalArray[i] = array2[j];
        }

        return totalArray;
    }
}
