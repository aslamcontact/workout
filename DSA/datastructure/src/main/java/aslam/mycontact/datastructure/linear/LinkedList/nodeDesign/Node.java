package aslam.mycontact.datastructure.linear.LinkedList.nodeDesign;

public interface Node<T> {
    Node<T> nextNode();
    void setData(T t);
    T getData();
}
