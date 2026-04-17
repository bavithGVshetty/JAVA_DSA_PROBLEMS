package DAY2.SESSION1;

public class SubscriptionRenewalWindow {
    public static int longestWindow(int[] nums, int K) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        for (right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > K) {
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9 };
        int K = 4;
        System.out.println(longestWindow(nums, K));
    }
}
