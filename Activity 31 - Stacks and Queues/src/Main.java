public class Main {
    public static void main(String[] args) {
        System.out.println("-=-=-=-=-=- Stack -=-=-=-=-=-");
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.print("pop returns: ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.println(stack.pop() + " ");

        System.out.println();

        System.out.println("-=-=-=-=-=- Queue -=-=-=-=-=-");
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.print("dequeue returns: ");
        System.out.print(queue.dequeue() + " ");
        System.out.print(queue.dequeue() + " ");
        System.out.println(queue.dequeue() + " ");

        System.out.println();

        System.out.println("-=-=-=-=- Questions -=-=-=-=-");

        System.out.println("Question 1 Answer:");
        System.out.println("     A queue is more appropriate for FIFO (first in, first out) situations" +
                "\n     such as restaurant orders that must be completed in the order that they are placed.");
        System.out.println("Question 2 Answer:");
        System.out.println("     A stack is ordered by LIFO (last in, first out)," +
                "\n     whereas a queue is ordered by FIFO (first in, first out).");
    }
}
