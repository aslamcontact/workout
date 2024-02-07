package aslam.mycontact.datastructure.linear.implementation.linkedlist.deletion;

import aslam.mycontact.datastructure.linear.implementation.linkedlist.operations.deletion.DeleteNodes;
import aslam.mycontact.datastructure.linear.implementation.linkedlist.operations.insertions.InsertNodes;
import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.Head;
import aslam.mycontact.datastructure.linear.linkedlist.operations.Deletion;
import aslam.mycontact.datastructure.linear.linkedlist.operations.Insertion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class DeleteNodesTest {

     private Deletion<Integer> deletion=new DeleteNodes<>();
     private Head<Integer> head;
     private Insertion<Integer> insertion=new InsertNodes<Integer>();
     @BeforeEach
     void doBeforeEach()
     {
          head=new Head<>();


     }

    @Test
    void removeFirst() {
        insertion.insertFirst(4,head);
        insertion.insertFirst(5,head);
      deletion.removeFirst(head);
      assertThat(head.getNode().getData().intValue()).isEqualTo(4);
      assertThat(head.getNode().nextNode()).isEqualTo(null);
      deletion.removeFirst(head);
      assertThatThrownBy(()->deletion.removeFirst(head))
              .isInstanceOf(IllegalStateException.class)
              .hasMessage("Empty Node");
    }

    @Test
    void removeLast() {
         assertThatThrownBy(()->deletion.removeLast(head))
                 .isInstanceOf(IllegalStateException.class)
                         .hasMessage("Empty Node");
        assertThat(head.getNode()).isEqualTo(null);
        insertion.insertLast(4,head);
        insertion.insertLast(5,head);
        insertion.insertLast(6,head);
        assertThat(head.getNode().nextNode().nextNode().getData()).isEqualTo(6);
        deletion.removeLast(head);  //rm 6
        assertThat(head.getNode().nextNode().nextNode()).isEqualTo(null);
        assertThat(head.getNode().nextNode().getData()).isEqualTo(5);
        deletion.removeLast(head);   // rm 5
        assertThat(head.getNode().nextNode()).isEqualTo(null);
        assertThat(head.getNode().getData()).isEqualTo(4);
        deletion.removeLast(head);   // rm 4
        assertThat(head.getNode()).isEqualTo(null);
    }

    @Test
    @Disabled
    void removeMiddle() {

     }
}