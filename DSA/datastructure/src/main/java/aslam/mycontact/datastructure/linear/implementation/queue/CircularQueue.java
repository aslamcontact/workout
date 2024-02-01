package aslam.mycontact.datastructure.linear.implementation.queue;

import aslam.mycontact.datastructure.linear.queue.Queue;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.List;

public class CircularQueue<T> implements Queue<T> {


    List<T> items;
    int front=-1;
    int rear=-1;
    int size;

    public CircularQueue(int size) {
        items=new ArrayList<>(size);
        this.size = size;
    }
    @Override
    public void enQueue(T t) {
        if(isFull()) throw new IllegalStateException("Queue is Full");
        if(isEmpty()) front=0;

        // for circular queue
        rear=(rear+1)%size;

         //update queue element,when next cycle point
        // to first position of queue
       if(front<=rear)
        items.add(rear,t);
       else items.set(rear,t);

    }

    @Override
    public T deQueue() {
        T t;
        if(isEmpty()) throw new IllegalStateException("Queue is Empty");
        if (front==rear)
        {
            t=items.get(front);
             rear=front=-1;
             return t;
        }
        t=items.get(front);
        front=(front+1)%size;
        return t;
    }

    @Override
    public boolean isFull() {
        return ((rear+1)%size==front) || (front==0 && rear==(size-1));
    }

    @Override
    public boolean isEmpty() {
        return front==-1 && rear==-1;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is Empty");
        return items.get(front);
    }
}
