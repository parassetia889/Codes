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
    public ListNode reverseList(ListNode head) {
        
        if(head == null)
            return head;
        
      
        ListNode prev = head, curr = head.next;
          head = head.next;
        
        prev.next = null;
        
        while(head != null){
            head = head.next;
            curr.next = prev;
            prev = curr;
            curr = head;
            
            
        }
        head = prev;
        
        return head;
    }
}