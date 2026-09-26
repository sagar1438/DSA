class Solution {
    public int missingNumber(int[] nums) {
    int sol = nums.length;
    for(int i = 0;i<nums.length;i++){
        sol -=  nums[i]-i;
    }
    return sol;
    }
}