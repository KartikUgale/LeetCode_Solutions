public class QueMain {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 2, 3, 2, 1, 1, 1};
        Solution01 s1 = new Solution01();
        Solution02 s2 = new Solution02();

        System.out.println(s1.majorityElement(nums));
        System.out.println(s2.majorityElement(nums));
    }
}
