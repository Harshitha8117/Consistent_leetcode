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
        List<Integer> re=new ArrayList<>();
        if(root==null){
            return new ArrayList<Integer>();
        }
        re.addAll(postorderTraversal(root.left));
        re.addAll(postorderTraversal(root.right));
        re.add(root.val);
        return re;
    }
}