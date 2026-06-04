class Solution {
    public String countAndSay(int n) {

        if(n == 1) return "1";

        String num = countAndSay(n-1);

        String sol = "";
        int count = 1;
        for(int i = 1;i<num.length();i++){
            if(num.charAt(i)==num.charAt(i-1)){
                count++;
            }else{
                sol += (char)('0'+count);
                sol += num.charAt(i-1);
                count=1;
            }
        }
        sol += (char)('0'+count);
        sol += num.charAt(num.length()-1);
        return sol;
    }
}