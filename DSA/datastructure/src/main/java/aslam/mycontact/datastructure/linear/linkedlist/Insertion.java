package aslam.mycontact.datastructure.linear.linkedlist;

import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.Head;
import aslam.mycontact.datastructure.linear.linkedlist.nodeDesign.Node;

public interface Insertion<T> {


    Head<T> insertFirst(T newNodeValue, Head<T> head);
    Head<T> insertLast(T newNodeValue, Head<T> head);
    Head<T> insertMiddle(T newNodeValue, Head<T> head, T addBefore);
}
