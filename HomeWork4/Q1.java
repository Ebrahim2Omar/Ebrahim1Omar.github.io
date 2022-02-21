package DataStructur.HomeWork.LabHomework.HomeWork4;

/**
 * Created by Ibrahim on 2/21/2022.
 */
public class Q1 {
    public int size2(){
        Node<E> n = header.getNext();
        int size = 0;
        while (n.getNext() != null){
            n = n.getNext();
            size++;
        }
        return size;
    }
}
