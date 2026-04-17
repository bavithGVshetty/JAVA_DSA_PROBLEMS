package DAY4.SESSION2;

public class TargetSum {
    public static int findTargetSum(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int P = (target + totalSum) / 2;
        int[] dp = new int[P + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = P; j >= num; j--) {
                dp[j] = dp[j] + dp[j - num];
            }
        }
        return dp[P];

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 1 };
        int target = 3;
        System.out.println(findTargetSum(nums, target));
    }

}
