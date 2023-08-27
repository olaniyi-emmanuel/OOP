package stacks;


import sun.text.normalizer.UCharacter;

import java.util.Stack;

public class KNit {


    public String reverse (String input) {
        Stack<Character> stack = new  Stack<Character>();
        for (char ch: input.toCharArray())
            stack.push(ch);
        String reversed = " ";
        while (!stack.empty())
            reversed += stack.pop();
        return reversed;
    }
    public static void main(String[] args) {
        String str = "abcd";


    }

}

