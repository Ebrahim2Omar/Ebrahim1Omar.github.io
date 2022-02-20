package DataStructur.Lab5;

import java.util.Scanner;

/**
 * Created by Ibrahim on 2/8/2022.
 */
public class ListOfStd {
    public static void main(String[] args) {
        DoublyLinkedList<Student> list = new DoublyLinkedList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("id\t"+"name\t"+"major");
            int id=in.nextInt();
            String name=in.next();
            String m = in.next();
            Student s = new Student(id,name,m);
            list.addLast(s);
        }
        while (!list.isEmpty()){
            System.out.println(list.removeFirst());
        }
    }


}
