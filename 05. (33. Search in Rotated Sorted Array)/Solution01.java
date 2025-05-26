class Solution01 {  // Brute Force
    public int search(int[] nums, int target) {
        // forget sorted & rotated

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
