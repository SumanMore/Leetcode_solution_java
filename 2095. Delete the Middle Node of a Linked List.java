class Solution {
    public ListNode deleteMiddle(ListNode head) {
      int l=length(head);
      if(l==1)
      {
        return null;
      }
      ListNode curr=head;
      for(int i=1;i<Math.ceil(l/2);i++)
      {
          curr=curr.next;
      }
      curr.next=curr.next.next;
      return head;
    }
    int length(ListNode head)
    {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
          c++;
          temp=temp.next;
        }
        return c;
    
    }
}
