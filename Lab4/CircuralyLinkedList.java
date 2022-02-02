package DataStructur.Lab4;

/**
 * Created by Ibrahim on 2/1/2022.
 */
public class CircuralyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    private Node<E> tail = null;
    private int size = 0;

    CircuralyLinkedList(){}

    public boolean isEmpty(){return size == 0;}

    public int size(){
        return size;
    }

    public E first(){
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        if(isEmpty()) {
            tail = new Node<E>(e, null);
            tail.setNext(tail);
        }
        else {
            Node<E> newNode = new Node<E>(e,tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }
    public void addLast(E e){
      addFirst(e);
        tail = tail.getNext();
    }

    public E remove(){
        if (isEmpty())
            return null;

        Node<E> x = tail.getNext();

        if (size == 1){// or if(x == tail)
            tail = null;
        }
        else
            tail.setNext(x.getNext());
        size--;
        return x.getElement();
    }

    public void rotate(){
        if (tail != null){
            tail = tail.getNext();
        }
    }
}
