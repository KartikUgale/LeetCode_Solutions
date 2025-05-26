class Solution01 {      // fixed one num have majority
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 0;

        for (int num : nums) {
            if (num == major) {
                count ++;
            } else if (count == 0) {
                major = num;
            } else {
                count--;
            }
        }

        return major;
    }
}
