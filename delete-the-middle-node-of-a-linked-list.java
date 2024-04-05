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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        int length = length(head);
        ListNode temp = head;
        int node_count =0;
        while(node_count!=(length/2)-1){
            temp=temp.next;
            node_count++;
        }
        temp.next = temp.next.next;
        return head;

    }
    public int length(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}
