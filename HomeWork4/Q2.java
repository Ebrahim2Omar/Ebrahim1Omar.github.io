package DataStructur.HomeWork.LabHomework.HomeWork4;

/**
 * Created by Ibrahim on 2/21/2022.
 */
public class Q2 {
    public boolean equalss(DoublyLinkedList<E> l2){
        if (this.isEmpty()) return false;
        if (this.size() != l2.size()) return false;
        if (this == l2) return true;
        Node<E> nL1 = this.header.getNext();
        Node<E> nL2 = l2.header.getNext();
        while (nL1.getNext() != null){
            System.out.println("1 : "+nL1.getElement()+"   2 : "+nL2.getElement());
            if (!(nL1.getElement().equals(nL2.getElement())))return false;
            nL1 = nL1.getNext();
            nL2 = nL2.getNext();
        }
        return true;
    }
}
