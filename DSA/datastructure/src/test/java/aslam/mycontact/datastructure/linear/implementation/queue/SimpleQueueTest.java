package aslam.mycontact.datastructure.linear.implementation.queue;

import aslam.mycontact.datastructure.linear.queue.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class SimpleQueueTest {

    Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue=new SimpleQueue<>(2);
    }

    @Test
    void enQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        assertThatThrownBy(()->queue.enQueue(5))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Queue is Full");

    }

    @Test
    void deQueue() {
        assertThatThrownBy(()->queue.deQueue())
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Queue is Empty");
        queue.enQueue(5);
        queue.enQueue(6);
        assertThat(queue.deQueue()).isEqualTo(5);
        assertThat(queue.deQueue()).isEqualTo(6);
        queue.enQueue(10);
        assertThat(queue.deQueue()).isEqualTo(10);
    }

    @Test
    void isFull() {
        assertThat(queue.isFull()).isEqualTo(false);
        queue.enQueue(1);
        queue.enQueue(2);
        assertThat(queue.isFull()).isEqualTo(true);

    }

    @Test
    void isEmpty() {
        assertThat(queue.isEmpty()).isEqualTo(true);
        queue.enQueue(1);
        assertThat(queue.isFull()).isEqualTo(false);

    }

    @Test
    void peek() {
       assertThatThrownBy(()->queue.peek())
               .isInstanceOf(IllegalStateException.class)
               .hasMessage("Queue is Empty");
       queue.enQueue(8);
       assertThat(queue.peek()).isEqualTo(8);

    }
}