package aslam.mycontact.datastructure.linear.implementation.stack;

import aslam.mycontact.datastructure.linear.stack.Stack;

import java.util.ArrayList;
import java.util.List;

public class SimpleStack implements Stack {

    private final List<Integer> items;
    private final Integer size;
    private Integer point=-1;

    public SimpleStack(Integer size) {
        this.items = new ArrayList<Integer>();
        this.size = size;
    }

    @Override
    public void push(Integer value) {
        if(isFull())
            throw  new IllegalStateException("Stack is full");
        else{
            items.add(value);
            point++;
        }

    }

    @Override
    public Integer pop() {
        Integer value;
          if(isEmpty())
             throw new IllegalStateException("Stack is empty");
        value=items.remove(point.intValue());
        point--;
        return  value;
    }

    @Override
    public Boolean isEmpty() {
        return point==-1;
    }

    @Override
    public Boolean isFull() {
        return size-1==point;
    }

    @Override
    public Integer peek() {

        if(isEmpty()) throw new IllegalStateException("Stack is empty");
        return items.get(point);
    }
}
