package twosum;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public Match findPair(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            if (map.containsKey(target - x)) {
                return Match.of(target - x, map.get(target - x));

            } else {
                map.put(x, target - x);
            }
        }
        return null;
    }

}
