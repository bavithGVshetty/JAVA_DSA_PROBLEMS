package DAY2.SESSION2;

public class SingleNumberIII {

    public static int[] singleNumber(int[] nums) {
        int addXor = 0;
        for (int num : nums) {
            addXor ^= num;
        }
        // Rightmost Set bit
        int diffBit = addXor & (-addXor);

        // a & b
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[] { a, b };

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 2, 5 };
        int[] result = singleNumber(nums);
        System.out.println(result[0] + " " + result[1]);
    }

}
