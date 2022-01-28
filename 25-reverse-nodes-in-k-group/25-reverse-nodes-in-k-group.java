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
    public ListNode reverseKGroup(ListNode head, int k) {
        
       int len = getLength(head); 
       return helper(head, k, len);
        
    }
    public ListNode helper(ListNode head, int k, int n){
          
        if(head == null)
            return null;
        
        ListNode next = null;
        ListNode curr = head;
        ListNode prev = null;
        int count = 0;
        if( n < k)
            return curr;
        
            
        //step1 reverse k nodes
        while(curr != null && count < k ){
            next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next;
            count++;
        }
        
        //step2: recursive call
        if(curr != null )
            head.next = reverseKGroup(curr,k);
            
        //step3: return head of reversed list
            return prev;
    }
    
    public int getLength(ListNode head){
        if(head == null)
            return 0;
        ListNode temp = head;
        int count = 1;
        while(temp != null && temp.next!=null){
            temp = temp.next;
            count++;
        }
        return count;
        
    }
}