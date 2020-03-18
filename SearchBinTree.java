/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode temp;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        modOrder(root, val);
        if(temp == null) return null;
        return temp;
    }
    
    public void modOrder(TreeNode root, int val){
        if(root == null) return;
        if(root.val == val) temp = root;
        modOrder(root.left, val);
        modOrder(root.right, val);
        
    }
}