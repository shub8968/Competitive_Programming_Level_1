package stringmanipulation;

import java.util.Scanner;

public class SubStringMethoDemo {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String test = kb.nextLine();
        System.out.println(test.substring(1));
        System.out.println(test.substring(1, test.length() - 1));
        System.out.println(test.substring(1, test.length()));
        System.out.println(test.substring(2));

    }
}
