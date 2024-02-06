package aslam.mycontact.datastructure.linear.implementation.linkedlist.deletion;

import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.Head;
import aslam.mycontact.datastructure.linear.linkedlist.Deletion;
import aslam.mycontact.datastructure.linear.linkedlist.nodeDesign.Node;

public class DeleteNodes<T> implements Deletion<T> {
    @Override
    public Head<T> removeFirst(Head<T> head) {
        if(head.getNode()==null) throw new IllegalStateException("Empty Node");
        head.setNode(head.getNode().nextNode());
        return head;
    }

    @Override
    public Head<T> removeLast(Head<T> head) {
        Node<T> currentNode=head.getNode();
        if(currentNode==null) throw new IllegalStateException("Empty Node");
        while (currentNode.nextNode()!=null)
        {
            if(currentNode.nextNode().nextNode()==null)
            {
                currentNode.setNextNode(null);
                break;
            }
            currentNode=currentNode.nextNode();
        }
        return  head;
    }

    @Override
    public Head<T> removeMiddle(T t, Head<T> head) {

        return null;
    }
}
