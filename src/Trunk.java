import java.util.HashMap;
import java.util.Map;

public class Trunk {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Programming");
        map.put(200, "Cloud Service");
        map.put(300, "Networking");
        map.put(400, "Database");
        for(Map.Entry<Integer, String> m: map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());

        }
    }
}
