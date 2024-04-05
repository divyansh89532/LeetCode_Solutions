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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddHeadtemp = oddHead;
        ListNode evenHeadtemp = evenHead;  
          
        while(evenHeadtemp!=null && evenHeadtemp.next!=null){
            oddHeadtemp.next = evenHeadtemp.next;
            oddHeadtemp = oddHeadtemp.next;
            evenHeadtemp.next = oddHeadtemp.next;
            evenHeadtemp = evenHeadtemp.next;    
        }
        oddHeadtemp.next = evenHead;
        return oddHead;

    }
}
