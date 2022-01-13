package DataStructur;

import java.util.Scanner;

/**
 * Created by Ibrahim on 1/12/2022.
 */
public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter number ("+(i+1)+") :");
            array[i] = input.nextInt();
        }
        System.out.print("{");
        for (int i:array) {
            System.out.print(" "+i);
        }
        System.out.print(" }");
    }
}
