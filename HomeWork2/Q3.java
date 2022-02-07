package DataStructur.HomeWork.LabHomework.HomeWork2;

/**
 * Created by Ibrahim on 2/3/2022.
 */
public class Q3 {
    public SingleLinkedList<E> concat(SingleLinkedList<E> l1, SingleLinkedList<E> l2){
        l1.tail.setNext(l2.head);
        l1.size = l1.size()+l2.size();
        return l1;
    }
}
