package DataStructur.Lab6;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Ibrahim on 2/15/2022.
 */
public class Test {
    public static void main(String[] args) {
//        LindedStack<String> stack = new LindedStack<String>();
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Input naem:");
//            stack.push(in.next());
//            System.out.println("top: "+stack.top()+"\t size: "+stack.size());
//        }
//
//        while(!stack.isEmtpy()){
//            System.out.println(stack.pop());
//        }

        ArrayStack<String> stack = new ArrayStack<String>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Input naem:");
            stack.push(in.next());
            System.out.println("top: "+stack.top()+"\t size: "+stack.size());
        }

        while(!stack.isEmtpy()){
            System.out.print(stack.pop());
        }
    }
}
