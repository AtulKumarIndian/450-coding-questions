
import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = {2,7,9,3,1};
        int result = rob(houses);
        System.out.println(result);
    }
    public static int rob(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        // return memo(n-1, nums, dp);
        return tabu(n, nums);
    }
    public static int rec (int idx, int[] values){
        if(idx < 0) return 0;
        int pick = values[idx]+ rec(idx-2, values); //if picked then skip the adjacent
        int notPick = rec(idx-1, values); //not picked values[idx], so can consider adjacent
        return Math.max(pick, notPick);
    }
    
    public static int memo(int idx, int[] values, int[] dp){
        if(idx < 0) return 0;
        if(dp[idx] != -1) return dp[idx]; // check the value in dp
        int pick = values[idx]+ memo(idx-2, values, dp);
        int notPick = memo(idx-1, values, dp);
        return dp[idx] = Math.max(pick, notPick); // store the value in dp
    }
    public static int tabu(int n, int[] values){
        int dp[] = new int[n];
        dp[0] = values[0];
        for(int idx = 1; idx < n; idx++){
            int pick = values[idx];
            if(idx > 1) pick += dp[idx-2];
            int notPick = dp[idx-1];
            dp[idx] = Math.max(pick, notPick);
        }
        return dp[n-1];
    }
}
