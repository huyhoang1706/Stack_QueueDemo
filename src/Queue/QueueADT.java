package Queue;

public interface QueueADT {
    boolean isEmpty();

    void enqueue(int data);

    int dequeue();

    int peek();

    int size();
}
