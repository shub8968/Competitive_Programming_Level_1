package stringmanipulation;

import java.util.*;

public class AllSubStrings {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String test = kb.next();
        String [] result = subArrays1(test);
        for(String x : result){
            System.out.println(x);
        }
    }

    private static String [] subArrays1(String s){
        Set <String> set = new LinkedHashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i ++){
            for(int j = i; j < s.length(); j++){
                String k = s.substring(i, j+1);
                set.add( k );
                count++;
            }
        }
        String [] arr = new String[set.size()];
        System.out.println(arr[arr.length-1]);
        return set.toArray(arr);
    }
}
