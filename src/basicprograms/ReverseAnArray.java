package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of Elements in Array ");
        int i = kb.nextInt();
        System.out.println("Enter array Elements");
        int arr[] = new int[i];
        int count = 0;
        while (i > 0) {
            arr[count++] = kb.nextInt();
            i--;
        }

        int arrReversed [] = reverseArrI(arr);
        System.out.print("Array Reversed through Iterative approach- ");
        System.out.println(Arrays.toString(arrReversed));
       // System.out.print("Array Reversed through Recursive approach - ");

    }

    private static int[] reverseArrI(int arr[]) {


        for (int i = 0; i < arr.length/2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }

//    private static int [] reverseArrR(int arr[]){
//
//        return null;
//    }

}
