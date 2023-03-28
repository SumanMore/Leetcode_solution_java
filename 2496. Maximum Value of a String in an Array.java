class Solution {
    public int maximumValue(String[] strs)
    {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        int l=0,d=0,zero=0;;
        for(int i=0;i<strs.length;i++)
        {
            l=0;
            d=0;
            zero=0;
            String s=strs[i];
            int len=s.length();
            for(int j=0;j<s.length();j++)
            {
                if(Character.isLetter(s.charAt(j)))
                {
                    l++;
                }
                else if(s.charAt(j)>='0' && s.charAt(j)<='9')
                {
                    d++;
                }
                else if(s.charAt(j)=='0')
                {
                    zero++;
                }
            }
            if (zero==len)
            {
                ob.add(0);
            }
            else if(d==len)
            {
                ob.add(Integer.parseInt(s));
            }
            else if(l==0 && d>0)
            {
                ob.add(d);
            }
            else
            {
                ob.add(l+d);
            }
        }
        Collections.sort(ob);
        System.out.println(ob);
        return ob.get(ob.size()-1);
        
    }
}
