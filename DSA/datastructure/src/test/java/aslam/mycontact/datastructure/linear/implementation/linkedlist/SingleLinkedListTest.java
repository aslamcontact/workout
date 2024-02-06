package aslam.mycontact.datastructure.linear.implementation.linkedlist;

import aslam.mycontact.datastructure.linear.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;
class SingleLinkedListTest {

    @Test
    void getHead() {
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
}