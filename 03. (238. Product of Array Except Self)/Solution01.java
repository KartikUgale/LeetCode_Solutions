import java.util.Arrays;

class Solution01 {  // Brute Force
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] result = new int[len];
        Arrays.fill(result, 1);

        for (int i=0; i<len; i++) {
            for (int j=0; j<len;  j++) {
                if (j != i) {
                    result[i] *= nums[j];
                }
            }
        }
        return result;
    }
}