class Solution {
    public boolean isValid(String s) {
        char ch[]=s.toCharArray();
        Stack<Character> ob=new Stack<Character>();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='('|| ch[i]=='['|| ch[i]=='{')
            {
                ob.add(ch[i]);
            }
            else
            {
                if(ob.isEmpty())
                {
                    return false;
                }
                if(ch[i]==')'&& ob.peek()!='(')
                {
                    return false;
                }
                if(ch[i]==']'&& ob.peek()!='[')
                {
                    return false;
                }
                if(ch[i]=='}'&& ob.peek()!='{')
                {
                    return false;
                }
                ob.pop();
            }
        }
        return ob.isEmpty();
        
    }
}
