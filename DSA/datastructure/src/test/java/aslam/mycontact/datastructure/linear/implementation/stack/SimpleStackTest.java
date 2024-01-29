package aslam.mycontact.datastructure.linear.implementation.stack;

import aslam.mycontact.datastructure.linear.Stack;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SimpleStackTest {


   private Stack stack ;


    @BeforeEach
    void afterEachPass()
    {
        stack=new SimpleStack(3);
    }


    @Test
    void push() {
        stack.push(5);
        stack.push(4);
        stack.push(3);
        assertThatThrownBy(()->stack.push(2))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Stack is full");
    }

    @Test
    void pop() {
        stack.push(5);
        stack.push(4);
        stack.push(3);
        assertThat(3).isEqualTo(stack.pop().intValue());
        assertThat(4).isEqualTo(stack.pop().intValue());
        assertThat(5).isEqualTo(stack.pop().intValue());
        assertThatThrownBy(()->stack.pop())
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Stack is empty");


    }

    @Test
    void isEmpty() {
        assertThat(Boolean.valueOf(true)).isEqualTo(stack.isEmpty());
        stack.push(3);
        assertThat(Boolean.valueOf(false)).isEqualTo(stack.isEmpty());

    }

    @Test
    void isFull() {
        assertThat(Boolean.valueOf(false)).isEqualTo(stack.isFull());
        stack.push(5);
        stack.push(5);
        stack.push(5);
        assertThat(Boolean.valueOf(true)).isEqualTo(stack.isFull());
    }

    @Test
    void peek() {
        assertThatThrownBy(()->stack.peek())
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Stack is empty");
         stack.push(6);
        assertThat(Integer.valueOf(6)).isEqualTo(stack.peek());
         stack.pop();
         stack.push(4);
        assertThat(Integer.valueOf(4)).isEqualTo(stack.peek());
    }
}