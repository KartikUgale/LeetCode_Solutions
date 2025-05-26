public class Solution02 {   // Brute force 2
    public int search(int[] nums, int target) {
        int length = nums.length;

        int sIndex = 0; // Starting Index
        int eIndex = 0; // ending Index
        for (int i=0; i<length; i++) {
            if (nums[i] > nums[i+1]) {
                eIndex = i;
                sIndex = i+1;
                break;
            }
        }

        int left = 0;
        int right = 0;

        if (target >= nums[sIndex] && target <= nums[length-1]) {
            left = sIndex;
            right = length-1;
        } else {
            left = 0;
            right = eIndex;
        }

        while (left <= right) {
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;

            int mid = (left + right) / 2;
            
            if (nums[mid] == target) return mid;

            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
