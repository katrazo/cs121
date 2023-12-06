package stacksPractice;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack <Integer> nums = new Stack<>();

        nums.push(1);
        System.out.println(nums.peek());
        nums.push(2);
        System.out.println(nums.peek());
        nums.push(3);
        System.out.println(nums.peek());
        nums.push(4);
        System.out.println(nums.peek());
        System.out.println(nums.isEmpty());
        nums.pop();
        System.out.println(nums.peek());
        nums.pop();
        System.out.println(nums.peek());
        nums.pop();
        System.out.println(nums.peek());
        nums.pop();
        System.out.println(nums.isEmpty());
    }
}
