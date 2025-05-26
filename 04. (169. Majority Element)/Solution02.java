import java.util.HashMap;

public class Solution02 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int maxCount = 0;
        int majorityElement = nums[0];

        for (Integer key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                majorityElement = key;
            }
        }

        return majorityElement;
    }
}
