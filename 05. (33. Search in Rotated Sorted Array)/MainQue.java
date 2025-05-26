public class MainQue {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 6;

        Solution01 s1 = new Solution01();
        Solution02 s2 = new Solution02();
        Solution03 s3 = new Solution03();

        System.out.println(s1.search(nums, target));
        System.out.println(s2.search(nums, target));
        System.out.println(s3.search(nums, target));
    }
}
