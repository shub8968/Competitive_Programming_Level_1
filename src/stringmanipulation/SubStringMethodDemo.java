package stringmanipulation;

import java.util.Scanner;

public class SubStringMethodDemo {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String test = kb.nextLine();
        System.out.println(test.substring(6,7));
        System.out.println(test.substring(1));
        System.out.println(test.substring(1, test.length() - 1));
        System.out.println(test.substring(1, test.length()));
        System.out.println(test.substring(2));

    }
}
