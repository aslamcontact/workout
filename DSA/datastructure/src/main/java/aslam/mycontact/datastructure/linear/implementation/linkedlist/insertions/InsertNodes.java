package aslam.mycontact.datastructure.linear.implementation.linkedlist.insertions;

import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.Head;
import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.SingleNode;
import aslam.mycontact.datastructure.linear.linkedlist.Insertion;
import aslam.mycontact.datastructure.linear.linkedlist.nodeDesign.Node;

public class InsertNodes<T> implements Insertion<T> {


    @Override
    public Head<T> insertFirst(T newNodeValue, Head<T> head) {
        if(head.getNode()==null) {
            head.setNode(new SingleNode<T>(newNodeValue));
            return head;
        }
        var newNode=new SingleNode<>(newNodeValue);
        newNode.setNextNode(head.getNode());
        head.setNode(newNode);
       return head;
    }

    @Override
    public Head<T> insertLast(T newNodeValue, Head<T> head) {
        Node<T> currentNode;
        currentNode=head.getNode();
        if(currentNode==null) {
            currentNode = new SingleNode<T>(newNodeValue);
            head.setNode(currentNode);
            return head;
        }
        while (currentNode.nextNode()!=null)
        {
            currentNode=currentNode.nextNode();
        }
        currentNode.setNextNode(new SingleNode<>(newNodeValue));
        head.setNode(currentNode);
        return head;
    }

    @Override
    public Head<T> insertMiddle(T newNodeValue, Head<T> head, T addBefore) {
        if(head.getNode()==null) {
            head.setNode(new SingleNode<T>(newNodeValue));
            return head;
        }
        Node<T> currentNode=head.getNode();
      // add logic
      return head;
    }
}
