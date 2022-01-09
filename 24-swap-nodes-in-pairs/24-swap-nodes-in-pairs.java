class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode temp = head;
        head = head.next;
        temp.next = swapPairs(head.next);
        head.next = temp;
        
        return head;
    }
}