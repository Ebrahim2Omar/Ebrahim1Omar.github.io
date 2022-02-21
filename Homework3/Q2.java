package DataStructur.HomeWork.LabHomework.Homework3;

/**
 * Created by Ibrahim on 2/21/2022.
 */
public class Q2 {
    public boolean equals(CircuralyLinkedList<E> l2){
        if (this.isEmpty()||l2.isEmpty()) return false;
        if (this.tail.getElement() != l2.tail.getElement()) return false;
        if (this.size() != l2.size()) return false;
        if (this == l2) return true;
        Node<E> nL1 = this.tail.getNext(),nL2 = l2.tail.getNext();
        while(nL1 != this.tail){
            if ((nL1.getElement().equals(nL2.getElement()))) return false;
            nL1 = nL1.getNext();
            nL2 = nL2.getNext();
        }
        return true;
    }
}
