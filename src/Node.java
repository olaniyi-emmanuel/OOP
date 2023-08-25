import java.util.LinkedList;

public class Node {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<String>();
        System.out.println(linked.size());
        linked.add("Java");
        linked.add("C#");
        linked.add("Python");
        linked.add("Rust");
        linked.add("Go");
        linked.add("Perl");
        linked.add("SQl");

        linked.add(3, "C++");

        System.out.println(linked);


    }
}
