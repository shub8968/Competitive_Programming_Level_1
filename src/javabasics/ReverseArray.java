package javabasics;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String [] args) {

     int arr [] = reverse(new int[]{1,2,9,8,7});
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int [] reverse (int arr []){

       int arr1 [] = new int [arr.length];
       for(int i = arr.length ; i > 0; i --){
           int temp1 = arr[i -1];
           arr1[arr.length  - i ] = temp1;
       }
       return arr1;
    }

}
