class Solution {
    public int numOfStrings(String[] patterns, String word) {
        ArrayList<String> ob=new ArrayList<String>();
        for(String s:patterns)
        {
            ob.add(s);
        }
        int c=0;
        for(String i:ob)
        {
            if(word.contains(i))
            {
                c++;
            }
        }
        return c;
    }
}
