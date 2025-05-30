public class Solution03 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;

            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;

            if (nums[mid] >= target) {
                if (nums[mid] > target && nums[left] <= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
