package leetcode;

/*
This Code will not work in the case of Nested Brackets for Example : [()]
 */
public class ValidParentheses_1 {
}

class Solution {
    public boolean isValid(String s) {


        char arr[] = s.toCharArray();

        if (arr.length == 0 | arr.length == 1) {
            return false;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            char k = arr[i];
            char a = '(';
            char b = '{';
            char c = '[';

            switch (k) {

                case '(': {

                    if (arr[i + 1] == ')') {
                        i++;
                    } else {
                        return false;
                    }
                    break;
                }
                case '{': {
                    if (arr[i + 1] == '}') {
                        i++;
                    } else {
                        return false;
                    }
                    break;
                }
                case '[': {
                    if (arr[i + 1] == ']') {
                        i++;
                    } else {
                        return false;
                    }
                    break;
                }


            }

        }

        return true;
    }
}