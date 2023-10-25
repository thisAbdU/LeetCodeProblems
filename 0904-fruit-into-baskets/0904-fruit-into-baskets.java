import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) {
            return 0;
        }
        
        Map<Integer, Integer> fruitType = new HashMap<>();
        int maxSum = 0;
        int count = 0;
        int left = 0;
        
        for (int right = 0; right < fruits.length; right++) {
            int currentFruit = fruits[right];
            
            if (fruitType.containsKey(currentFruit)) {
                fruitType.put(currentFruit, fruitType.get(currentFruit) + 1);
            } else {
                fruitType.put(currentFruit, 1);
                count++;
            }
            
            while (count > 2) {
                int leftFruit = fruits[left];
                if (fruitType.get(leftFruit) == 1) {
                    fruitType.remove(leftFruit);
                    count--;
                } else {
                    fruitType.put(leftFruit, fruitType.get(leftFruit) - 1);
                }
                left++;
            }
            
            maxSum = Math.max(maxSum, right - left + 1);
        }
        
        return maxSum;
    }
}
