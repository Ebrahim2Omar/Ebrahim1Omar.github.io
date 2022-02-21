package DataStructur.HomeWork.LabHomework.Homework3;

/**
 * Created by Ibrahim on 2/21/2022.
 */
public class Q1 {
    public int mySize(){        // size method  without instance variable
        if(tail == null) return 0;
        int size = 1;
        Node<E> n = tail.getNext();
        while(n != tail){
            n = n.getNext();
            size++;
        }
        return size;
    }
}
