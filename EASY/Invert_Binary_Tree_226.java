
class Solution {
    public TreeNode invertTree(TreeNode root) {
         TreeNode sol = root;
         if(root == null){
            return sol;
        }else{
            sol = new TreeNode(root.val);
        }
        sol.left = invertTree(root.right);
        sol.right = invertTree(root.left);
        return sol;
    }
}