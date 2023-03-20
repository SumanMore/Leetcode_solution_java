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
    public ListNode middleNode(ListNode head) {
        ListNode root=head;
        int l=0;
        while(root!=null)
        {
            root=root.next;
            l++;
        }
        l=(int)Math.ceil(l/2);
        for(int i=0;i<l;i++)
        {
            head=head.next;
        }
        return head;
    }
}
