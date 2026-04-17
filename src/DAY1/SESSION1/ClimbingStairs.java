package DAY1.SESSION1;

public class ClimbingStairs {
    static int Climb(int N) {
        if (N == 1 || N == 0) {
            return 1;
        }
        return Climb(N - 1) + Climb(N - 2);
    }

    public static void main(String[] args) {
        System.out.println(Climb(4));
    }
}
