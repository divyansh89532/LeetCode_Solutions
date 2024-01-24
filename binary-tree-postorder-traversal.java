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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        printNode(root,arr);
        return arr;
    }
    public void printNode(TreeNode root, List<Integer> arr)
    {
        if(root==null)
            return ;
        printNode(root.left,arr);
        printNode(root.right,arr);
        arr.add(root.val);    
    }
}
