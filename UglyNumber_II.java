class Solution {
    public int nthUglyNumber(int n) {
       if(n==1) return 1;
        int[] dp = new int[n+1]; // dp[i] holds the ith's ugly number
        dp[1] = 1;
        int p2=1, p3=1, p5=1;
        for(int i=2; i<=n; i++){ // loop invariant:dp[i] holds the smallest ith uglynumber
            dp[i] = Math.min(2*dp[p2], Math.min(3*dp[p3],5*dp[p5])); 
            if(dp[i]==2*dp[p2])p2++; 
            if(dp[i]==3*dp[p3])p3++;
            if(dp[i]==5*dp[p5])p5++;
        }
        return dp[n];
    }
}
