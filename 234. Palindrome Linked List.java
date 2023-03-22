
class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode temp=head;
       ArrayList<Integer> ob=new ArrayList<Integer>();
       while(temp!=null)
       {
           ob.add(temp.val);
           temp=temp.next;
       }
    int i=0,j=ob.size()-1;
    while(i<j)
    {
        if((int)ob.get(i)!= (int)ob.get(j))
        {
            return false;
        }
            i++;
            j--;
        
    }
    return true;
    }
}


corect solution but not an optimal one.
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9')
           {
                s1=s1+s.charAt(i);
           }
        }
        int j=0;
        int k=s1.length()-1;
        
        while(j<k)
        {
            if(s1.charAt(j)!=s1.charAt(k))
            {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}
