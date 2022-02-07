package DataStructur.HomeWork.LabHomework.HomeWork2;

/**
 * Created by Ibrahim on 2/3/2022.
 */
public class Q1 {
    public E FindSecond_to_Nod(Node<E> n){
        Node<E> t = n;
        if (t == null || t.getNext() == null)
            return null;
        while (t.getNext().getNext() != null){
            t = t.getNext();
        }
        return t.getElement();
    }
}
