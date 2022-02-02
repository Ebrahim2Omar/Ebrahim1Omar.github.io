package DataStructur.Lab4;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2/1/2022.
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CircuralyLinkedList<String> list = new CircuralyLinkedList<>();
        int choi = -1;
        do{
            System.out.println("1 to add first or 2 to add last 3 to remove first or 4 to rotate or 0 to exit ");
            choi = in.nextInt();
        switch (choi){
            case 1:
                System.out.println("Input name: ");
                list.addFirst(in.next());
                System.out.println("first : "+list.first()+"  last : "+list.last());
                break;
            case 2:
                System.out.println("Input name: ");
                list.addLast(in.next());
                System.out.println("first : "+list.first()+"  last : "+list.last());
                break;
            case 3:
                System.out.println("the removed Name is "+list.remove());
                System.out.println("first : "+list.first()+"  last : "+list.last());
                break;
            case 4:
                list.rotate();
                System.out.println("first : "+list.first()+"  last : "+list.last());
                break;
            case 0:
                System.out.println("Good by!");
        }
        }while (choi != 0);
    }
}
