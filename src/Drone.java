import java.util.Vector;

public class Drone {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        System.out.println(vector.size());

        vector.add("Programmming");
        vector.add("Networking");
        vector.add("Clod Computing");
        vector.add("Deployment");
        vector.add("Databases");
        vector.remove(0);
        System.out.println(vector.size());

    }
}
