package DataStructur.Lab5;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2/8/2022.
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        for (int i = 0; i <6 ; i++) {
            int choice;
            System.out.println("1- add first \n2- add last\n3- remove first\n4- remove last\n\tEnter your choice:");
            choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("add firs:");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("add last:");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("removed firs:"+ list.removeFirst());
                    break;
                case 4:
                    System.out.println("removed last:"+ list.removeLarst());
                    break;
                default:
                    System.out.println("wrong choice!");
            }
            System.out.println("First :"+list.first()+" last : "+list.last()+" size : "+list.size());

        }
    }
}
