class Solution {
    public int trap(int[] height) {
        int sol = 0;

        int leftmax = height[0];
        int rightmax = height[height.length-1];
        int left = 0;
        int right = height.length-1;
        while(left<right){
            leftmax = Math.max(leftmax,height[left]);
            rightmax = Math.max(rightmax,height[right]);

            if(leftmax<=rightmax){
                sol += leftmax-height[left];
                left++;
            }else{
                sol += rightmax - height[right];
                right--;
            }
        }
        return sol;
    }
}