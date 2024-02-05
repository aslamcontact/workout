package aslam.mycontact.datastructure.linear.linkedlist.nodeDesign;

public interface Node<T> {
    Node<T> nextNode();
    void setNextNode(Node<T> nextNode);
    void setData(T t);
    T getData();
}
