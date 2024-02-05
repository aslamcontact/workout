package aslam.mycontact.datastructure.linear.implementation.linkedlist.node;

import aslam.mycontact.datastructure.linear.linkedlist.nodeDesign.Node;

public class Head<T> {
    private Node<T> node;

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }
}
