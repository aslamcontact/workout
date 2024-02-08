package aslam.mycontact.datastructure.linear.implementation.linkedlist;

import aslam.mycontact.datastructure.linear.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;
class SingleLinkedListTest {

    SingleLinkedList<Integer> list;

    @BeforeEach
    void beforeEach()
    {
        this.list = new SingleLinkedList<>();
    }
    @Test
    void getHead() {

        list.addFirst(5);
        list.addFirst(34);
        list.addLast(10);
        assertThat(list.getHead()
                .getNode()
                .getData()).isEqualTo(34);
        assertThat(list.getHead()
                .getNode()
                .nextNode()
                .nextNode()
                .getData()).isEqualTo(10);

    }
    @Test
    void addFront() {

        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addFirst(5);
        list.addFirst(34);
        assertThat(list.getHead()
                .getNode()//34
                .getData()).isEqualTo(34);
        list.addFirst(100);
        assertThat(list.getHead()
                .getNode()//34
                .getData()).isEqualTo(100);

    }

    @Test
    void addLast() {

        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addFirst(5);
        list.addFirst(34);
        list.addLast(10);
        assertThat(list.getHead()
                .getNode()
                .getData()).isEqualTo(34);
        assertThat(list.getHead()
                .getNode()
                .nextNode()
                .nextNode()
                .getData()).isEqualTo(10);



    }

    @Test
    void removeFirst()
    {
        list.addLast(40);
        list.addLast(100);
        list.addLast(200);
        assertThat(this.list.getHead().getNode().getData()).isEqualTo(40);
        list.removeFirst();
        assertThat(this.list.getHead().getNode().getData()).isEqualTo(100);
        list.removeFirst();
        assertThat(this.list.getHead().getNode().getData()).isEqualTo(200);
        list.removeFirst();
        assertThat(this.list.getHead().getNode()).isEqualTo(null);

    }

    @Test
    void removeLast()
    {
        list.addLast(40);
        list.addLast(100);
        list.addLast(200);
        assertThat(this.list.getHead()
                .getNode()   //40
                .nextNode()  //100
                .nextNode()//200
                .getData()).isEqualTo(200);
        list.removeLast();
        assertThat(this.list.getHead()
                .getNode()   //40
                .nextNode()  //100
                .getData()).isEqualTo(100);

        list.removeLast();
        assertThat(this.list.getHead()
                .getNode()   //40
                .getData()).isEqualTo(40);

        list.removeLast();
        assertThat(this.list.getHead()
                .getNode()
                ).isEqualTo(null);


    }
}