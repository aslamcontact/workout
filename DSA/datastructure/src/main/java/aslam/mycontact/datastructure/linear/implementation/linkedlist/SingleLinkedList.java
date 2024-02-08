package aslam.mycontact.datastructure.linear.implementation.linkedlist;

import aslam.mycontact.datastructure.linear.implementation.linkedlist.operations.deletion.DeleteNodes;
import aslam.mycontact.datastructure.linear.implementation.linkedlist.operations.insertions.InsertNodes;
import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.Head;
import aslam.mycontact.datastructure.linear.linkedlist.AddElement;
import aslam.mycontact.datastructure.linear.linkedlist.RemoveElement;
import aslam.mycontact.datastructure.linear.linkedlist.operations.Deletion;
import aslam.mycontact.datastructure.linear.linkedlist.operations.Insertion;
import aslam.mycontact.datastructure.linear.linkedlist.LinkedList;

public class SingleLinkedList<T> implements LinkedList<T>, AddElement<T>, RemoveElement<T> {
    Insertion<T> insertion;
    Deletion<T> deletion;
    private Head<T> head;

    public SingleLinkedList() {
        this.head=new Head<T>();
        this.insertion= new InsertNodes<T>();
        this.deletion=new DeleteNodes<>();
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


    @Override
    public void removeFirst() {
          deletion.removeFirst(this.head);
    }

    @Override
    public void removeLast() {
        deletion.removeLast(this.head);
    }
}
