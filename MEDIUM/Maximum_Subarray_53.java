class Solution {
    public int maxSubArray(int[] nums) {
        int sol = Integer.MIN_VALUE;
        int i = 0;
        int curr = 0;
        while(i<nums.length){
            curr += nums[i];
            sol = Math.max(curr,sol);
            if(curr<0){
                curr = 0;
            }
            i++;
        }
        return sol;
    }
}