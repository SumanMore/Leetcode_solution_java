class Solution {
    public String largestGoodInteger(String num) {
        if(num.length()<=2)
        {
            return "";
        }
        ArrayList<Integer> ob=new ArrayList<Integer>();
        String s="";
        for(long i=0;i<num.length()-2;i++)
        {
            if(num.charAt((int)i)==num.charAt((int)(i+1)) && num.charAt((int)i)==num.charAt((int)(i+2)))
            {
                s=s+num.charAt((int)i)+num.charAt((int)i)+num.charAt((int)i);
                ob.add(Integer.parseInt(s));
                System.out.println(ob);
                i+=2;
            }
            s="";
        }  
        Collections.sort(ob);
        String res="";
        if(ob.size()>=1)
        {
        res=Integer.toString(ob.get(ob.size()-1));
        }
        if(res.equals("0"))
        {
            res="000";
        }
        return res;    
    }
}
