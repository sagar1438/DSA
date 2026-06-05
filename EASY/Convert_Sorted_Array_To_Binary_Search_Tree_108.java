class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(0,nums.length-1,nums);
    }
    public TreeNode createTree(int s , int e ,int [] nums){
    
        if(s>e) return null;
        int mid = s + (e-s)/2;
        TreeNode newNode = new TreeNode(nums[mid]);

        newNode.left = createTree(s,mid-1,nums);
        newNode.right = createTree(mid+1,e,nums);
        return newNode;
    }
}