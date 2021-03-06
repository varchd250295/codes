package leetcode;

import java.util.HashMap;
import java.util.Map;

// TIME - O(n)
// SPACE - O(n)

// https://leetcode.com/problems/two-sum/
class lc_twosum {
    public int[] twoSum(int[] nums, int target) {
        // iterate over array putting value in hashmap(for look-back). Find the target pair(forward or backward)
        Map<Integer, Integer> hm = new HashMap<>();
        // to store remaining value -> target - current index value
        int rem;
        for(int i= 0; i < nums.length; i++) {
            rem = target - nums[i];
            if(hm.containsKey(rem) && hm.get(rem) != i)
                return new int[] {hm.get(rem), i};
            hm.put(nums[i], i);
        }
        throw new IllegalArgumentException("No such pair. Incorrect input");
    }
}
