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
    public int widthOfBinaryTree(TreeNode root) {
        
        if (root == null)
            return 1;
        Queue<TreeNode> queue = new LinkedList<>();
        int maxWidth = 0, left = 0;
        Map<TreeNode, Integer> map = new HashMap<>();
        map.put(root, 0);
        queue.add(root);
        while (!queue.isEmpty()){
            
            int len = queue.size();
            left = map.get(queue.peek());
            for (int i=1; i<=len; i++){
                
                TreeNode p = queue.poll();
                int pos = map.get(p);
                maxWidth = Math.max(maxWidth, pos - left + 1);
                if (p.left != null){
                    queue.offer(p.left);
                    map.put(p.left, 2*pos);
                }
                if (p.right != null){
                    queue.offer(p.right);
                    map.put(p.right, 2*pos+1);
                }
            }
        }
        return maxWidth;
    }
}
