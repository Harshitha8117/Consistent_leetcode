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
    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next==null)
        return true;

        ArrayList<Integer> res=new ArrayList<>();
        ListNode temp=head;

        while(temp!=null){
            res.add(temp.val);
            temp=temp.next;
        }

        int start=0,end=res.size()-1;
        while(start<end){
            if(!res.get(start).equals(res.get(end)))
            return false;
                start++;
                end--;
        }
        return true;
    }
}