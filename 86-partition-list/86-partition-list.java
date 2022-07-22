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
    public ListNode partition(ListNode head, int x) {
        
        
      if(head == null)
          return head;
        
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        
        ListNode dummy1 = new ListNode(-1);
        dummy1.next = l1;
        
        ListNode dummy2 = new ListNode(-1);
        dummy2.next = l2;
        
        while(head != null){
            
            if(head.val < x){
                l1.next = head;
                l1 = l1.next;
            }
            else{
                l2.next = head;
                l2 = l2.next; 
             }
            head = head.next;
            
        }
        l1.next = dummy2.next.next;
        l2.next = null;
        
        return dummy1.next.next;
    }
}