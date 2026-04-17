package DAY1.SESSION2;

public class BananaEatingProblem {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int N = piles.length;
        int right = Math.max(piles[0], piles[N - 1]);
        int answer = right;
        while (left <= right) {
            int mid = (left + right) / 2;
            int totalHours = 0;
            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid;
            }
            if (totalHours <= h) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));

    }
}
