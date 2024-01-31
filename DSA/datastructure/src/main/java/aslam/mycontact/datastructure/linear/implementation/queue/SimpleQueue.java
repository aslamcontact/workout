package aslam.mycontact.datastructure.linear.implementation.queue;

import aslam.mycontact.datastructure.linear.queue.Queue;

import java.util.ArrayList;
import java.util.List;

public class SimpleQueue<T> implements Queue<T> {

    List<T> items;
    int front=-1;
    int rear=-1;
    int size;

    public SimpleQueue(int size) {
        items=new ArrayList<>();
        this.size = size;
    }


    @Override
    public void enQueue(T t) {

        if(isFull())
            throw  new IllegalStateException("Queue is Full");
        if(isEmpty()) front=rear=0;
        else rear ++;
        items.add(t);
    }

    @Override
    public T deQueue() {
        T t;
        if(isEmpty())
            throw new IllegalStateException("Queue is Empty");
        t=items.get(front);
        if(front==rear) {
            front = rear = -1;
            items.removeAll(items);
            return t;
        }
        front++;
        return t;
    }

    @Override
    public boolean isFull() {
        return rear==size-1;
    }

    @Override
    public boolean isEmpty() {
        return rear==-1 && front==-1;
    }

    @Override
    public T peek() {

        if(isEmpty()) throw  new IllegalStateException("Queue is Empty");
        return items.get(front);
    }
}
