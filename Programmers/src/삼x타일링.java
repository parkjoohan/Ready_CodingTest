class Solution {
    public int solution(int n) {
        int answer = 0;
        int mod = 1000000007;
        int[] dp = new int[n+1];
        
        dp[1]=2;
        dp[2]=3;
        
        for(int i=3; i<=n; i++){
            // Â¦¼ö
            if(i%2==0)
                dp[i] = dp[i-1]%mod + dp[i-2]%mod;
            // È¦¼ö
            else
                dp[i] = dp[i-1]*2%mod + dp[i-2]%mod;
            dp[i] = dp[i]%mod;
        }
        return dp[n];
    }
}