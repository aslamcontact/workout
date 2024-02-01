package aslam.mycontact.datastructure.linear.implementation.queue;

import aslam.mycontact.datastructure.linear.queue.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CircularQueueTest {

    Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue=new CircularQueue<>(4);
    }


    @Test
    void enQueue() {

        //[1,2,3,4]
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        assertThatThrownBy(()->queue.enQueue(5))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Queue is Full");
        //[empty,empty,3,4]
        assertThat(queue.deQueue()).isEqualTo(1);
        assertThat(queue.deQueue()).isEqualTo(2);
        //[5,6,3,4]
        queue.enQueue(5);
        queue.enQueue(6);
        // check if queue is full after
        assertThatThrownBy(()->queue.enQueue(5))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Queue is Full");


    }

    @Test
    void deQueue() {

        //fill queue  [10,70,3,4]
        queue.enQueue(10);
        queue.enQueue(70);
        queue.enQueue(3);
        queue.enQueue(4);

        //remove two element [empty,empty,3,4]
        assertThat(queue.deQueue()).isEqualTo(10);
        assertThat(queue.deQueue()).isEqualTo(70);

        //add two [5,6,3,4]
        queue.enQueue(5);
        queue.enQueue(6);

        assertThat(queue.deQueue()).isEqualTo(3);
        assertThat(queue.deQueue()).isEqualTo(4);
        assertThat(queue.deQueue()).isEqualTo(5);
        assertThat(queue.deQueue()).isEqualTo(6);
        assertThatThrownBy(()->queue.deQueue())
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Queue is Empty");

    }

    @Test
    void isFull() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        assertThatThrownBy(()->queue.enQueue(5))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Queue is Full");

    }

    @Test
    void isEmpty() {
        assertThatThrownBy(()->queue.deQueue())
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Queue is Empty");
    }

    @Test
    void peek() {

        queue.enQueue(10);
        queue.enQueue(70);
        queue.enQueue(3);
        queue.enQueue(4);

        //remove two element [empty,empty,3,4]
        assertThat(queue.peek()).isEqualTo(10);
        assertThat(queue.deQueue()).isEqualTo(10);
        assertThat(queue.deQueue()).isEqualTo(70);
        queue.enQueue(500);
        queue.enQueue(600);
        assertThat(queue.deQueue()).isEqualTo(3);
        assertThat(queue.deQueue()).isEqualTo(4);
        assertThat(queue.peek()).isEqualTo(500);
        assertThat(queue.deQueue()).isEqualTo(500);
        assertThat(queue.peek()).isEqualTo(600);
        assertThat(queue.deQueue()).isEqualTo(600);
        assertThatThrownBy(()->queue.peek())
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Queue is Empty");

    }
}