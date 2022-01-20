package HomeWork;
import java.util.*;
/**
 * Created by Ibrahim on 1/20/2022.
 */
public class RandomRemove {
    static void removerandomly(int[] array) {
        Random r = new Random();
        while (array.length > 0) {
            int index = r.nextInt(array.length);
            System.out.println("INDEX = " + index + ", ELEMENT = " + array[index]);
            int[] array1 = new int[array.length - 1];
            for (int i = 0; i < index; i++)
                array1[i] = array[i];
            for (int i = index; i < array.length - 1; i++)
                array1[i] = array[i + 1];
            array = array1;
        }
    }
}
