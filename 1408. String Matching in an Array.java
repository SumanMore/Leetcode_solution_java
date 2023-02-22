class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> ob=new HashSet<String>();
         for(int i = 0; i < words.length; i++)
         {
            for(int j = 0; j < words.length; j++)
            {
                if(i != j)
                {
                    if(words[i].contains(words[j]))
                    {
                        ob.add(words[j]);
                    }
                }
            }
         }
        ArrayList<String> ob1=new ArrayList<String>(ob);
        return ob1;
    }
}
