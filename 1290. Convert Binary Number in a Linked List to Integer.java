class Solution {
    public int getDecimalValue(ListNode head) {
        String s="";
        while(head!=null)
        {
            s=s+ (int)head.val;
            head=head.next;
        }
        return Integer.parseInt(s,2);
        
    }
}
