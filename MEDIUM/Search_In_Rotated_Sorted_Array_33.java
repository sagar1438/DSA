class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }
            return -1;
        }
       int end = 0;
        for(int i = nums.length-1; i>0;i--){
            if(nums[i]==target) return i;

            if(nums[i-1] >nums[i]){
                end = i-1;
                break;
            }
        }
        return search2(nums,target,0 ,end);
    }

    public int search2(int[] nums, int target, int start, int end) {
        if (start == end) {
            if (nums[start] == target)
                return start;
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] == target)
            return mid;

        if (nums[mid] < target) {
            return search2(nums, target, mid + 1, end);
        } else {
            return search2(nums, target, start, mid);
        }
    }

}