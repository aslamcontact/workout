package aslam.mycontact.datastructure.linear.implementation.linkedlist.node;

import aslam.mycontact.datastructure.linear.linkedlist.nodeDesign.Node;

public class SingleNode<T> implements Node<T> {

    private T t;
    private Node<T> nextNode;


    public SingleNode(T t, Node<T> nextNode) {
        this.t = t;
        this.nextNode = nextNode;
    }

    public SingleNode(T t) {
        this.t = t;
    }

    public SingleNode() {
    }

    @Override
    public Node<T> nextNode() {
        return nextNode;
    }

    @Override
    public void setNextNode(Node<T> nextNode) {
        this.nextNode=nextNode;
    }


    @Override
    public void setData(T t) {
          this.t=t;
    }

    @Override
    public T getData() {
        return t;
    }
}
