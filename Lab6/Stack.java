package DataStructur.Lab6;

/**
 * Created by Ibrahim on 2/15/2022.
 */
public interface Stack<E> {
    boolean isEmtpy();
    int size();
    E top();
    E pop();
    void push(E e);
}
