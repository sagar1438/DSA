class Solution {
    public boolean search(int[] nums, int target) {
        
        boolean flag = false;
        int n = nums.length;

        int lo = 0;
        int hi = n-1;

        for(int i=0; i<n; i++){
            if(nums[i] == target){
                flag = true;
            }
        }
        return flag;
    }
}