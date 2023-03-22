class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        {
            return head;
        }
       ListNode temp=head;
       while(temp!=null && temp.next!=null)
       {
           if(temp.next.val==val)
           {
               temp.next=temp.next.next;
           }
            else
            {
                temp=temp.next;
            }
        }
        if(head.val==val)
        {
            return head.next;
        }
        return head;
    }
}
