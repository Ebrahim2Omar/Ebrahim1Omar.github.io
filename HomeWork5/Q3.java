package DataStructur.HomeWork.LabHomework.HomeWork5;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Ibrahim on 2/21/2022.
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Input the expression in postfix: ");
        String exp = in.next();
        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            if(Character.isDigit(c))
                stack.push(c - '0');

            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }

        System.out.println("The result value : "+stack.pop());
    }
}
