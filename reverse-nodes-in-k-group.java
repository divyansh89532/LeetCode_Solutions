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
    public ListNode reverse(ListNode begin, ListNode end){
        ListNode prev =null,next;
        while(begin!=end){
            next = begin.next;
            begin.next = prev;
            prev = begin;
            begin = next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        ListNode dummy = new ListNode(0,head);
        ListNode back = dummy , forward = head;
        while(back!=null){
            int grouplen = 0;
            while(grouplen<k && forward!=null){
                forward = forward.next;
                ++grouplen;
            }
            if(grouplen!=k) break;
            ListNode last = back.next;
            back.next = reverse(back.next,forward);
            last.next = forward;
            back = last;
        }
        return dummy.next;
        
    }
}
