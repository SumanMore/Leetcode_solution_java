class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        return false;
        String[] strSplit1 = s.split("");
        String[] strSplit2 = t.split("");
        ArrayList<String> strList1 = new ArrayList<String>(Arrays.asList(strSplit1));
        ArrayList<String> strList2 = new ArrayList<String>(Arrays.asList(strSplit2));
        Collections.sort(strList1);
        Collections.sort(strList2);
        for(int i=0;i<strList1.size();i++)
        {
            if(!strList1.get(i).equals(strList2.get(i)))
            return false;
        }
        return true;
    }
}
