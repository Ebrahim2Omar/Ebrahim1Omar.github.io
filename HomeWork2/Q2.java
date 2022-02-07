package DataStructur.HomeWork.LabHomework.HomeWork2;

/**
 * Created by Ibrahim on 2/3/2022.
 */
public class Q2 {
    public int mySize(){
        Node<E> n = head;
        int size = 0;
        if (head == null) return size;
        while (n != null){
            n = n.getNext();
            size++;
        }
        return size;
    }

}
