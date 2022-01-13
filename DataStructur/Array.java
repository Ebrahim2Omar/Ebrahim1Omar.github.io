package DataStructur;

/**
 * Created by Ibrahim on 1/12/2022.
 */
public class Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.print("{");
        for (int i:array) {
            System.out.print(" "+i);
        }
        System.out.print(" }");
    }
}
