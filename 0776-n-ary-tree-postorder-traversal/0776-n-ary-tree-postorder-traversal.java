/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res=new ArrayList<>();
        
        if(root==null)
        return res;

        for(Node children:root.children){
            res.addAll(postorder(children));
        }

        res.add(root.val);
        return res;
    }
}