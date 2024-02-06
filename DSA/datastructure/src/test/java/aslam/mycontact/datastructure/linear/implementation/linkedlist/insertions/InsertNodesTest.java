package aslam.mycontact.datastructure.linear.implementation.linkedlist.insertions;

import aslam.mycontact.datastructure.linear.implementation.linkedlist.node.Head;
import aslam.mycontact.datastructure.linear.linkedlist.Insertion;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;
class InsertNodesTest {

    Insertion<Integer> insertion;
    Head<Integer> head;

    @BeforeEach
    void beforeEach()
    {
        insertion=new InsertNodes<Integer>();
        head=new Head<Integer>();
    }



    @Test
    void insertFirst() {

        head=insertion.insertFirst(500,head);
        assertThat(head.getNode().getData().intValue()).isEqualTo(500);
        head=insertion.insertFirst(20,head);
        assertThat(head.getNode().getData().intValue()).isEqualTo(20);
        head=insertion.insertFirst(1,head);
        head=insertion.insertFirst(2,head);
        head=insertion.insertFirst(3,head);
        assertThat(head.getNode().getData().intValue()).isEqualTo(3);
        assertThat(head.getNode().nextNode().getData().intValue()).isEqualTo(2);
        assertThat(
                head.getNode()
                        .nextNode()  //2
                        .nextNode()  //1
                        .nextNode()  //20
                        .nextNode() //500
                        .getData().intValue()).isEqualTo(500);
        assertThat(
                head.getNode()
                        .nextNode()  //2
                        .nextNode()  //1
                        .nextNode()  //20
                        .nextNode()  //500
                        .nextNode()).isEqualTo(null); //null

       // assertThat(head.nextNode().nextNode()).isEqualTo(null);

    }


    @Test
    void insertLast() {
        head=insertion.insertLast(500,head);
        head=insertion.insertFirst(7,head);
        head=insertion.insertLast(400,head);
        head=insertion.insertFirst(300,head);
      //  {300,7,500,400}
        assertThat(
                head.getNode()     //300
                        .nextNode()//7
                        .nextNode()//500
                        .nextNode()//400
                        .getData().intValue()).isEqualTo(400);


    }

    @Test
    @Disabled
    void insertMiddle() {
    }
}