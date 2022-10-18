package leetcode;

import java.util.Scanner;

public class HappyNumber {

    private static boolean isHappy(int n){

        if(n < 10){

            if(n == 1){
                return true;
            }else{
                return false;
            }
        }

        int k = n;
        int sum = 0;
        while( k > 0){
            k = k / 10;
        int j = n % 10;
        n = k;
        sum = sum + j * j;
        }

        boolean result = isHappy(sum);
        return result;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println(isHappy(kb.nextInt()));

    }
}
