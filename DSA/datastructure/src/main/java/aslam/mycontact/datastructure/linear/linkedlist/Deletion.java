package aslam.mycontact.datastructure.linear.linkedlist;

import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.Head;

public interface Deletion<T> {

    Head<T> removeFirst(Head<T> head);
    Head<T> removeLast(Head<T> head);
    Head<T> removeMiddle(T t,Head<T> head);


}
