package aslam.mycontact.datastructure.linear.implementation.linkedlist;

import aslam.mycontact.datastructure.linear.implementation.linkedlist.operations.insertions.InsertNodes;
import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.Head;
import aslam.mycontact.datastructure.linear.linkedlist.AddElement;
import aslam.mycontact.datastructure.linear.linkedlist.operations.Insertion;
import aslam.mycontact.datastructure.linear.linkedlist.LinkedList;

public class SingleLinkedList<T> implements LinkedList<T>, AddElement<T> {
    Insertion<T> insertion;
    private Head<T> head;

    public SingleLinkedList() {
        this.head=new Head<T>();
        this.insertion= new InsertNodes<T>();
    }


    @Override
    public Head<T> getHead() {
        return head;
    }
    public void addFirst(T value)
    {
       head=insertion.insertFirst(value,head);
    }
    public void addLast(T value)
    {

        head=insertion.insertLast(value,head);
    }


}
