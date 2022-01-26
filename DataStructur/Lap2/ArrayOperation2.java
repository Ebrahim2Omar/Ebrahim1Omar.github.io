package DataStructur.Lap2;
import java.util.*;
/**
 * Created by Ibrahim on 1/19/2022.
 */
public class ArrayOperation2 {
    int[] array;
    int numOfElemnt;
    ArrayOperation2(){
        array = new int[5];
    }
    public int add(int e){
        if (numOfElemnt < array.length){
            array[numOfElemnt] = e;
            numOfElemnt++;
            return 0;
        }
        else
            return -1;
    }

    public int addSorted(int e){
        if (numOfElemnt < array.length){
            int i = numOfElemnt;
            while (i > 0 && e < array[i-1]){
                array[i] = array[i-1];
                i--;
            }
            array[i] = e;
            numOfElemnt++;
            return 0;
        }
        else
            return -1;
    }

    public  int delet(){
        if (numOfElemnt > 0){
            array[numOfElemnt-1] = 0;
            numOfElemnt--;
            return 0;
        }
        else
            return -1;
    }

    public int sequentialSearch(int key){
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayOperation2 test = new ArrayOperation2();
        for (int i = 0; i < 7 ; i++) {
            System.out.println("input number("+(i+1)+") :");
            if (test.addSorted(in.nextInt())==0){
                System.out.println("added sucssefuly");
            }
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.array));
        }


        for (int i:test.array) {
            System.out.print(" "+i);
        }

        for (int i = 0; i < 7 ; i++) {
            if (test.delet()==0){
                System.out.println("deleted sucssefuly");
            }
            else
                System.out.println("array is empty");
            System.out.println(Arrays.toString(test.array));
        }
    }
}
