package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if(numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(num, i);
            }
        }
        // Handle case when no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

}
