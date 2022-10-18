package stringmanipulation;

import java.util.*;

public class AllSubArrays {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String test = kb.next();
        String [] result = subArrays1(test);
        for(String x : result){
            System.out.println(x);
        }
    }

    private static String [] subArrays1(String s){
        String res [] = new String[2*(s.length() * s.length() + 1)/2];
        int count = 0;
        for(int i = 0; i < s.length(); i ++){

            for(int j = i; j < s.length(); j++){

                res[count] = s.substring(j, s.length()   );
                count++;
            }
        }

        return res;
    }
}
