package javabasics;

import java.util.Arrays;

public class ArrayType {
    public static void main(String args[]) {
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        String [] alias1 = new String[3];
        System.out.println(bugs.equals(alias));
        System.out.println(
                bugs.toString());
        System.out.println(Arrays.toString(bugs));
        System.out.println(Arrays.toString(alias));
        if(bugs == alias){
            System.out.println("Result for bugs == alias -> " + true);
        }
        else{
            System.out.println("Result for bugs == alias -> " + false);

        }

        if(bugs.equals(alias)){
            System.out.println("Result for bugs.equals(alias1) -> " + true);
        }
        else{
            System.out.println("Result for bugs.equals(alias1) -> " + false);

        }
        if(bugs == alias1){
            System.out.println("Result for bugs == alias1 -> " + true);
        }
        else{
            System.out.println("Result for bugs == alias1 -> " + false);

        }

        if(bugs.equals(alias1)){
            System.out.println("Result for bugs.equals(alias1) -> " + true);
        }
        else{
            System.out.println("Result for bugs.equals(alias1) -> " + false);

        }


    }
}
