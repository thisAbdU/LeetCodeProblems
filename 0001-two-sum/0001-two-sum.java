import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsPos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(numsPos.containsKey(target - nums[i])){
                return new int[]{numsPos.get(target - nums[i]), i};
            }
            else{
                numsPos.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
        