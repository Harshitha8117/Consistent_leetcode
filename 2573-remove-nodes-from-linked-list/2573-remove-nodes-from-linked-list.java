/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode dummy=head;
        while(dummy!=null){
        while(!stack.isEmpty() && stack.peek().val<dummy.val){
            stack.pop();
        }
        stack.push(dummy);
        dummy=dummy.next;
        }

        ListNode curr=null;
        while(!stack.isEmpty()){
            dummy=stack.pop();
            dummy.next=curr;
            curr=dummy;
        }
        return dummy;
    }
}