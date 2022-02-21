package DataStructur.HomeWork.LabHomework.HomeWork4;

/**
 * Created by Ibrahim on 2/21/2022.
 */
public class Q3 {
    public DoublyLinkedList<E> clone() throws CloneNotSupportedException {
        // always use inherited Object.clone() to create initial copy
        DoublyLinkedList<E> other = (DoublyLinkedList<E>) super.clone(); // safe cast
        if (size > 0) {                      // we need independent node chain
            other.header = new Node<>(null, null, null);
            other.trailer = new Node<>(null, other.header, null);
            other.header.setNext(other.trailer);
            Node<E> walk = header.getNext();   // walk through remainder of original list
            Node<E> otherWalk = other.header;
            for(int i = 0; i < size; i++) {           // make new node storing same element
                Node<E> newest = new Node<>(walk.getElement(), null, null);
                otherWalk.setNext(newest);   // link previous node to this one
                otherWalk = newest;
                otherWalk.setPrev(newest);   // link node back to the previous one
                walk = walk.getNext();
            }
        }
        return other;
    }

}
