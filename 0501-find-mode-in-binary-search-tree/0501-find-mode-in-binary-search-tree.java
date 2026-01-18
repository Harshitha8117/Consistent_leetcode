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
    private Integer prev=null;
    private int c=0;
    private int max_count=0;
    private List<Integer> mode=new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int res[]=new int[mode.size()];
        for(int i=0;i<mode.size();i++){
            res[i]=mode.get(i);
        }
        return res;
    }
    private void inorder(TreeNode node){
        if(node==null)
        return;
        inorder(node.left);
        if(prev!=null && node.val==prev){
            c++;
        }
        else{
            c=1;
        }
        if(c>max_count){
            max_count=c;
            mode.clear();
            mode.add(node.val);
        }
        else if(c==max_count){
            mode.add(node.val);
        }
        prev=node.val;
        inorder(node.right);
    }
}