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
 
  3
   / \
  9  20
    /  \
   15   7
 */
class Solution {
public List<List<Integer>> levelOrderBottom(TreeNode root) {
     List<List<Integer>> ret = new ArrayList<>();
     helper(root, 0, ret);
     Collections.reverse(ret);
     return ret;
 }
 
 private void helper(TreeNode root, int level, List<List<Integer>> ret) {
     if (root != null) {
         if (level == ret.size()) {
             ret.add(new ArrayList<>());
         }
         ret.get(level).add(root.val);
         helper(root.left, level+1, ret);
         helper(root.right, level+1, ret);
     }
 }
}
