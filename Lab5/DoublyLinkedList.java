package DataStructur.Lab5;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by Ibrahim on 2/8/2022.
 */
public class DoublyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DoublyLinkedList() {
        header = new Node<E>(null,null,null);
        trailer = new Node<E>(null,header,null);
        header.setNext(trailer);
    }

    public boolean isEmpty(){return size == 0;}

    public int size(){
        return size;
    }

    public E first(){
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    private void addBetween(E e,Node<E> p, Node<E> n){
        Node<E> newst = new Node<E>(e,p,n);
        p.setNext(newst);
        n.setPrev(newst);
        size++;
    }

    public void swap(DoublyLinkedList<E> l, int i, int j){
        Node<E> n1 = header;
        for (int k = 0; k < i && l.size()>1; k++) {
            n1 = n1.getNext();
        }

        Node<E> n2 = header;
        for (int k = 0; k < j && l.size()>1; k++) {
            n2 = n2.getNext();
        }
        E t = n1.getElement();
        n1.setElement(n2.getElement());
        n2.setElement(t);
    }

    public void swap2(DoublyLinkedList<E> l,int i, int j){

    }

    public void addFirst(E e){ addBetween(e,header,header.getNext()); }

    public void addLast(E e){
        addBetween(e,trailer.getPrev(),trailer);
    }

    private E remove(Node<E> x){
       Node<E> p = x.getPrev();
       Node<E> n = x.getNext();
        p.setNext(n);
        n.setPrev(p);
        size--;
        return x.getElement();
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    public E removeLarst(){
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }

    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.addFirst("A");
        l.addFirst("B");
        l.addFirst("C");
        l.addFirst("D");
        l.addFirst("E");
        l.swap(l,2,3);
        System.out.println(l.removeFirst());
        System.out.println(l.removeFirst());
        System.out.println(l.removeFirst());
        System.out.println(l.removeFirst());
        System.out.println(l.removeFirst());

    }
}
