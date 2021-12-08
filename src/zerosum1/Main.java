package zerosum1;



public class Main {

    public static void main(String[] args) {
        int a [] =  {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        System.out.println(ZeroSumNsq.hasZeroSumSubarray(a));
        int b [] = {4, -7, 1, 1};
        System.out.println(ZeroSumNsq.hasZeroSumSubarray(b));
    }
}
