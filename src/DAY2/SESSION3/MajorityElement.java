package DAY2.SESSION3;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        majorityElement(nums);
        System.out.println(majorityElement(nums));
    }

}
