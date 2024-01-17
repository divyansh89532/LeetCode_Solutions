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

// Recursion Solution

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         ArrayList <Integer> list = new ArrayList<Integer>();
//         printNode(root,list);
//         return list;
//     }
//         public void printNode(TreeNode root,ArrayList list){
//             if(root==null)
//                 return ;
//             printNode(root.left,list);
//             list.add(root.val);
//             printNode(root.right,list);
//         }
//     }


// Iterative Solution

class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        ArrayList<Integer> list =  new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty()|| temp!=null)
        {
            while(temp!=null)
            {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            list.add(temp.val);
            temp = temp.right;
        }
    return list;
    }
}
