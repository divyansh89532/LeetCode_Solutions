// in this approach we take the difference of the k and length and then break the link of that particular
// node and the head becomes the next node 


class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode temp = head;
        int length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        temp.next = head;
        k=k%length;
        int end = length-k;
        while(end!=0){
            temp=temp.next;
            end--;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
