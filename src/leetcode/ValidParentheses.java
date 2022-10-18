package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class ValidParentheses {


}


class Solution1 {
    public boolean isValid(String s) {

        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('(', ')');
        charMap.put('{', '}');
        charMap.put('[', ']');
        char arr[] = s.toCharArray();

        if (arr == null || arr.length == 0 || arr.length == 1) {
            return false;
        }


        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < arr.length; i++) {

            if (charMap.containsKey(arr[i])) {

                char topElement = '*';
                if (stack.empty() == true) {
                    stack.push(arr[i]);
                } else {
                    topElement = stack.pop();
                    if (topElement != charMap.get(arr[i])) {
                        return false;
                    }
                }

                stack.push(arr[i]);
            }
        }


        return stack.empty();

    }
}