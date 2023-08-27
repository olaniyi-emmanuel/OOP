import java.util.PriorityQueue;

public class Clear {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        System.out.println(queue.size());
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

    }
}
