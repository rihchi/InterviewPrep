package com.company.Sequences;
import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;

public class ValidParentheses {
    public static boolean solution(String input) {
        Stack<Character> stack = new Stack<Character>();

        HashSet<Character> openingBrackets = new HashSet<>();
        openingBrackets.add('{');
        openingBrackets.add('[');
        openingBrackets.add('(');

        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        bracketMap.put(')', '(');

        for (int i=0; i<input.length(); i++) {
            if (openingBrackets.contains(input.charAt(i)))
                stack.push(input.charAt(i));
            else if (bracketMap.containsKey(input.charAt(i))) {
                if (stack.isEmpty() || !stack.pop().equals(bracketMap.get(input.charAt(i))))
                    return false;
            }
        }

        if (!stack.isEmpty())
            return false;

        return true;
    }
}
