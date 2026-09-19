/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    
    public String serialize(TreeNode root) {
        if(root == null){  
        return "null";
       }
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                sb.append("null"+",");
                continue;
            }
            sb.append(curr.val + ",");
            q.add(curr.left);
            q.add(curr.right);
        }
        return sb.toString();

    }

 
    public TreeNode deserialize(String data) {
       if(data.equals("null")){  
        return null;
       }
        Queue<TreeNode> q = new LinkedList<>();
        String arr[] = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int i = 1;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(!arr[i].equals("null")){
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }i++;
            if(!arr[i].equals("null") && i<arr.length){
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }i++;

        }
        return root;
    }
}
