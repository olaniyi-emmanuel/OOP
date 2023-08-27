import java.util.NavigableMap;
import java.util.TreeMap;

public class Prone {
    public static void main(String[] args) {
        NavigableMap<String, Integer> numbers = new TreeMap<String, Integer>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("One", 1);

        System.out.println(numbers);
    }
}
