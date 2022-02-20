package DataStructur.Lab6;

import java.util.Arrays;

/**
 * Created by Ibrahim on 2/15/2022.
 */
public class ReversArrayUsingStack {
    public static void main(String[] args) {
        int a[] = {11,12,13,14,15};
        System.out.println("before revers: ");
        System.out.println(Arrays.toString(a));
        LindedStack<Integer> s = new LindedStack<>();
        for (int i = 0; i < a.length; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = s.pop();
        }
        System.out.println("after revers: ");
        System.out.println(Arrays.toString(a));
    }
}
