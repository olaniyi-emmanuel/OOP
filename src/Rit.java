import java.util.Stack;

public class Rit {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.size());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("New size of Stack: " + stack.size());
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());





    }
}
