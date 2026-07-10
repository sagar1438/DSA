
class Solution {
    public static void pre(TreeNode root , List<Integer> list){
        if(root==null) return;

        list.add(root.val);
        pre(root.left,list);
        pre(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        pre(root,list);
        return list;
    }
}