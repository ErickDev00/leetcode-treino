public class P070_ClimbingStairs {

        public int climbStairs(int n) {

            int j1 = 1;
            int j2 = 2;
            int total = 0;

            if (n == 1) return 1;
            if (n == 2) return 2;

            for (int i = 3; i <= n; i++) {
                total = j1 + j2;
                j1 = j2;
                j2 = total;
            }

            return total;

        }
}
