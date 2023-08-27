import java.util.LinkedHashMap;

public class Pawn {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<String, Integer>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println(evenNumbers);

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<String, Integer>(evenNumbers);
        numbers.put("Six", 6);
        System.out.println(numbers);
    }
}
