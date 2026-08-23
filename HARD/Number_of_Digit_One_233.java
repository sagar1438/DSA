class Solution {
    public int countDigitOne(int n) {
        String num = String.valueOf(n);
        Integer[][] dp = new Integer[num.length()][2];
        return memo(num,0,1,dp,num.length());
    }
    public int memo(String num,int i,int tight,Integer[][] dp,int len){
        if(i==len) return 0;
        if(dp[i][tight]!=null) return dp[i][tight];
        int ub = tight==1?num.charAt(i)-'0':9;
        int cnt = 0;
        for(int j=0;j<=ub;j++){
            if(j==1){
                cnt += count(num,i+1,tight==1&&j==ub?1:0,len)+memo(num,i+1,tight==1&&j==ub?1:0,dp,len);
            }else{
                cnt += memo(num,i+1,tight==1&&j==ub?1:0,dp,len);
            }
        }
        return dp[i][tight]=cnt;
    }
    public int count(String num,int i,int tight,int n){
        if(tight==0){
            return (int)Math.pow(10,n-i);
        }
        if(i==n) return 1;
        int cnt = 0;
        int ub = num.charAt(i)-'0';
        for(int j=0;j<=ub;j++){
            cnt += count(num,i+1,j==ub?1:0,n);
        }
        return cnt;
    }
}