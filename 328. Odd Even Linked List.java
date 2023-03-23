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
        if(head==null)
        {
            return head;
        }
        ListNode temp=head;
        ListNode temp1=head.next;;
        ListNode dummy1=temp;
        ListNode dummy2=temp1;
        while(temp!=null && temp.next!=null && temp1!=null && temp1.next!=null)
        {
                temp.next=temp.next.next;
                temp1.next=temp1.next.next;
                temp=temp.next;
                temp1=temp1.next;
            
        }
        temp.next=dummy2;
        return dummy1;


        
    }
}
