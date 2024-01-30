package aslam.mycontact.datastructure.linear.stack;

public interface Stack {

    void push(Integer value);
    Integer pop();
    Boolean isEmpty();
    Boolean isFull();
    Integer peek();
}
