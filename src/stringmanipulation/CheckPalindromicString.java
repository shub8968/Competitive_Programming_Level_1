package stringmanipulation;

import java.util.Scanner;

public class CheckPalindromicString {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String k = kb.nextLine();
        System.out.println(check(k));

    }

    private static boolean check(String s) {

        int begin = 0;
        int end = s.length() - 1;
        while (end > begin) {

            if (!s.substring(begin, begin + 1).equalsIgnoreCase(s.substring(end, end + 1))) {
                return false;
            }
            begin = begin +1;
            end = end - 1;


        }
        return true;
    }
}
