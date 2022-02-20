package DataStructur.Lab6;

import java.time.chrono.IsoEra;

/**
 * Created by Ibrahim on 2/15/2022.
 */
public class ArrayStack<E> implements Stack<E>{
    static final int CAPACITY = 100;
    E data[];
    int size = 0;
    int t= -1;

    public ArrayStack(int c){
        data = (E[]) new Object[c];
    }
    public ArrayStack(){
        this(CAPACITY);
    }

    @Override
    public boolean isEmtpy() {
        return t == -1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E top() {
        if (isEmtpy())
          return null;
        return data[t];
    }

    @Override
    public E pop() {
        if (isEmtpy())
            return null;
        E x = data[t];
        data[t] = null;
        t--;
        return x;
    }

    @Override
    public void push(E e) {
        if (size() == data.length)
            throw new IllegalStateException("Stack is full!");
        data[++t] = e;
    }
}
