package leetcode;

public class RemoveNumber {

    public int removeElement(int[] nums, int val) {

        int r = 0, w = 0;
        while (r < nums.length) {

            if (nums[r] == val) {

                r++;


            } else {

                nums[w] = nums[r];
                w++;
                r++;
            }
        }
        return w;
    }
}
