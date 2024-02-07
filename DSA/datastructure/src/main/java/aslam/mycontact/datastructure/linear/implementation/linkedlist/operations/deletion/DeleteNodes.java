package aslam.mycontact.datastructure.linear.implementation.linkedlist.operations.deletion;

import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.Head;
import aslam.mycontact.datastructure.linear.linkedlist.operations.Deletion;
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
        else if(currentNode.nextNode()==null)
        {
            head.setNode(null);
            return head;
        }
        while (currentNode!=null)
        {
             if(currentNode.nextNode().nextNode()==null)
             {
                 currentNode.setNextNode(null);

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
