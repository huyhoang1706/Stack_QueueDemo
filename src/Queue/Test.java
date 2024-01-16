package Queue;

public class Test {
    public static void main(String[] args) {
        /*QueueUsingArray queue = new QueueUsingArray();
        queue.enqueue(1);
        queue.enqueue(8);
        queue.enqueue(21);
        queue.enqueue(14);
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue);*/

        QueueUsingLinkedList queue2 = new QueueUsingLinkedList();
        queue2.enqueue(4);
        queue2.enqueue(42);
        queue2.enqueue(24);
        queue2.enqueue(52);
        System.out.println(queue2);
        System.out.println(queue2.dequeue());
        System.out.println(queue2);
    }
}
