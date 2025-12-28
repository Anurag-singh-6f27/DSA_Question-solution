package Dsa_Questions;
//#solveAfterLearningDP
import java.util.List;

//https://leetcode.com/problems/triangle
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // Copy the last row as the initial DP state
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        // Build up from the second-last row to the top
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }

        // The top element now contains the minimum path sum
        return dp[0];
    }
}
