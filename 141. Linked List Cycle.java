public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slower=head;
        ListNode faster=head;
        while(faster!=null && faster.next!=null)
        {
            slower=slower.next;
            faster=faster.next.next;
            if(slower==faster)
            {
                return true;
            }
        }
        return false;

        
    }
}
