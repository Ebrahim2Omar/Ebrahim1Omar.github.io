package DataStructur.Lab6;

/**
 * Created by Ibrahim on 1/25/2022.
 */
public class SingleLinkedList<E> {
    public static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SingleLinkedList() {}

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public E first(){
        if(isEmpty()==true)
            return null;
        return head.getElement();
    }

    public E last(){
        if(isEmpty())
            return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        head = new Node<E>(e,head);
        if (isEmpty())
            tail = head;
        size++;
    }

    public void addLast(E e){
        Node<E> n = new Node<E>(e,null);
        if (isEmpty())
            head = n;
        else
            tail.setNext(n);
        tail = n;
        size++;
    }

    public E removFirst(){
        if (isEmpty())
            return null;
        E x = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return x;
    }
    public Node<E> revers(Node<E> n){
        Node<E> per = null;
        Node<E> curr = n;
        Node<E> next = null;
        while (curr != null){
            next = curr.getNext();
            curr.setNext(per);
            per =   curr;
            curr = next;
        }
        n = per;
        return n;
    }

    public E FindSecond_to_Nod(Node<E> n){
        Node<E> t = n;
        if (t == null || t.getNext() == null)
            return null;
        while (t.getNext().getNext() != null){
            t = t.getNext();
        }
        return t.getElement();
    }

    public SingleLinkedList<E> concat(SingleLinkedList<E> l1, SingleLinkedList<E> l2){
       l1.tail.setNext(l2.head);
        l1.size = l1.size()+l2.size();

        return l1;
    }

    public SingleLinkedList<E> rotate(SingleLinkedList<E> list){
        if (list.size == 0)return null;
        if (list.size == 1)return list;

        SingleLinkedList<E> l2 = new SingleLinkedList<E>();
        while (!list.isEmpty()){
            l2.addFirst(list.removFirst());
        }
        return l2;
    }


/**
 *********************************
 *- Q12                          *
 *********************************
 public int sum(SingleLinkedList<E> list){
 int sum = 0;
 if (list.isEmpty())return sum;
 while(!list.isEmpty()){
 sum += list.removFirst();
 }
 return sum;
 }

 *********************************
 * - Q13                         *
 *********************************
private void addBetween(){
    Node<E> newst = new Node<E>(e,header,header.getNext());
    header.setNext(newst);
    header.getNext().setPrev(newst);
    size++;
}

 *********************************
 * - Q14                         *
 *********************************
 public void append(SingleLinkedList<E> list1, SingleLinkedList<E> list2){
 if (list1.isEmpty())return;
 while(!list2.isEmpty()){
 list1.addLast(list2.removFirst());
 }
 }

 *********************************
 * - Q15                         *
 *********************************
 public SingleLinkedList<E> concat(SingleLinkedList<E> l1, SingleLinkedList<E> l2){
 l1.tail.setNext(l2.head);
 l1.size = l1.size()+l2.size();
 return l1;
 }

 *********************************
 * - Q16                         *
 *********************************
 *  public void swap(DoublyLinkedList<E> l, int i, int j){
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

 *********************************
 * - Q17                         *
 *********************************

 */



    public static void main(String[] args) {
        SingleLinkedList<Integer> l1 = new SingleLinkedList<>();
        l1.addFirst(5);
        l1.addLast(6);
        l1.addLast(7);
//        System.out.println(l1.removFirst());
//        System.out.println(l1.removFirst());
//        System.out.println(l1.removFirst());
//        System.out.println(l1.first());
//        System.out.println(l1.FindSecond_to_Nod(l1.head));
        System.out.println(l1.size());
        l1 = l1.rotate(l1);
        System.out.println(l1.size()+" ");
        System.out.println(l1.removFirst());
        System.out.println(l1.removFirst());
        System.out.println(l1.removFirst());
    }
}
