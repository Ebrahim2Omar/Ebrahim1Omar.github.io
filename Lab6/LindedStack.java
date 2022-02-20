package DataStructur.Lab6;

/**
 * Created by Ibrahim on 2/15/2022.
 */
public class LindedStack<E> implements Stack<E>{
    SingleLinkedList <E> list = new SingleLinkedList<E>();

    @Override
    public boolean isEmtpy() {
        return list.isEmpty();
    }

    @Override
    public int size() {
       return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
       return list.removFirst();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }
}
