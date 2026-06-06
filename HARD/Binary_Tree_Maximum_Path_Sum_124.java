
class Solution {
    int sol = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max(root);
        return sol;
    }
    public int max(TreeNode root){
        if(root == null) return 0;

        int left = max(root.left);
        int right = max(root.right);

        int currmax = Math.max(left,right);

        if(currmax <= 0){
            sol = Math.max(sol, root.val);
        }else{
        int includeAll = left + right + root.val;
        int includeHead = currmax + root.val;
        int Currpath = Math.max(includeAll,includeHead);
        sol = Math.max(sol,Currpath);
        }

        return  Math.max(currmax + root.val,root.val);
    }
}