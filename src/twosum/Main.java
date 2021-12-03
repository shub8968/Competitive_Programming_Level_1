package twosum;

public class Main {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {5, 2, 6, 8, 1, 9};
        Match match = twoSum.findPair(nums, 10);
        Integer a = match.getA();
        Integer b = match.getB();
        System.out.println("A " + a);
        System.out.println("B "+ b);
    }
}
