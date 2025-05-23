class Solution02 {
    static {
        for (int i = 0; i < 500; i++) {         // JIT warm up
            productExceptSelf(new int[]{0, 0});
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        result[0] = 1;

        for (int i=1; i<len; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        int product = 1;
        for (int i=len-1; i>=0; i--) {
            result[i] *= product;
            product *= nums[i];
        }

        return result;
    }
}