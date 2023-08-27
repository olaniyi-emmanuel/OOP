package stacks;

import java.util.WeakHashMap;

public class Time {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> numbers = new WeakHashMap<String, Integer>();
        numbers.put("Two", 2);
        numbers.put("Four", 4);
        numbers.put("Six", 6);


        System.out.println(numbers);

        String four = new String("Four");
        Integer fourValue = 4;


    }
}
