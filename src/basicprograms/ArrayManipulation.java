package basicprograms;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {

        int arr [] = new int [] {1,2,1,5,1};

        for(int i = 0; i < arr.length; i++){

                arr[i] = -1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
