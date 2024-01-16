import Stack.StackUsingArray;
import Stack.StackUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        /*StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(0);

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack);*/

        StackUsingLinkedList stack2 = new StackUsingLinkedList();
        stack2.push(13);
        stack2.push(1);
        stack2.push(28);

        System.out.println(stack2);
        System.out.println(stack2.size());
        System.out.println(stack2);
    }
}