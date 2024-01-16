package Stack;

public class Test {
    static int getRandomValue(int range) {
        // generate random value between 0 -> range
        return (int) (Math.random() * range);
    }
    static StackUsingArray generateStack(int size) {
        StackUsingArray stack = new StackUsingArray(size);
        for (int i =0; i<size/2; i++) {
            stack.push(getRandomValue(10));
        }
        return stack;
    }

    static StackUsingLinkedList generateStack() {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        for (int i = 0; i < 10; i++) {
            stack.push(getRandomValue(20));
        }
        return stack;
    }
    public static void main(String[] args) {
        StackADT stack = generateStack(10);
        // stack
        System.out.println(stack);
        stack.push(14);
        System.out.println(stack);
    }
}
