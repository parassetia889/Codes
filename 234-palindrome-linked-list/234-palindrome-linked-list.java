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
        if(head.next == null)
            return true;
        ListNode temp = head;
        ListNode mid = getMid(head);
        ListNode rev = revList(mid);
        
        while(rev != null){
            if(rev.val != temp.val)
                return false;
            rev = rev.next;
            temp = temp.next;
        }
        return true;
    }
    
    public ListNode getMid(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode revList(ListNode node){
        ListNode curr = node;
        ListNode prev = null;
        ListNode forward = null;
        
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
}