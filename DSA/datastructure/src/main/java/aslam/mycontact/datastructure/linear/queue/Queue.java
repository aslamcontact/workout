package aslam.mycontact.datastructure.linear.queue;

public interface Queue {

      <T> void enQueue(T t);
      <T> T deQueue();
          boolean isFull();
          boolean isEmpty();
      <T> T peek();

}
