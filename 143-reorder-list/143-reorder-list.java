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
    public void reorderList(ListNode head) {
        
        ListNode head1 = head;
        ListNode mid = getMid(head);
        ListNode head2 = reverseList(mid.next);
        mid.next = null;
        
        
        
        
        //merging in zig-zag
        ListNode next;
        while(head2 != null){
            next = head1.next;
            head1.next = head2;
            head1 = head2;
            head2 = next;
        }
    }
    
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode forward = null;
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
}