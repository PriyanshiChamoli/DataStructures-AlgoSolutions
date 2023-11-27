//Given a set of positive integers and a target sum, determine whether there exists a subset whose sum is equal to the target sum.
//Solution: The solution uses dynamic programming to create a 2D array where dp[i][j] is true if there exists a subset of the first i elements with a sum equal to j.

public class SubsetSum {
    static boolean isSubsetSum(int[] set, int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= set[i - 1])
                    dp[i][j] = dp[i][j] || dp[i - 1][j - set[i - 1]];
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;

        if (isSubsetSum(set, n, sum))
            System.out.println("Found a subset with the given sum");
        else
            System.out.println("No subset with the given sum");
    }
}
