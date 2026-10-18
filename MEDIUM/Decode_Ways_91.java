class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);
        return decode(s, 0, dp);
    }

    public int decode(String s, int i, int dp[]) {

        if (i == s.length())
            return 1;

        if (dp[i] != -1)
            return dp[i];

        if (s.charAt(i) == '0')
            return 0;
        
        int sol2 = 0;
            if (i < s.length() - 1 && ((s.charAt(i) == '1') || (s.charAt(i) == '2' && s.charAt(i + 1) < '7'))) {
             sol2 += decode(s, i + 2, dp);
        }

        int sol = decode(s, i + 1, dp);


        return dp[i] = sol + sol2 ;
    }
}