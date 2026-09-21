/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        String tree = preOrderDFS(root);
        String subtree = preOrderDFS(subRoot);

        return tree.contains(subtree);
    }

    public String preOrderDFS(TreeNode root){
        if(root == null)
            return "null";

        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append(preOrderDFS(root.left));
        sb.append(preOrderDFS(root.right));
        return sb.toString();
    }
}
