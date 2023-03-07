class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=1,max=0;
        for(int i=0;i<sentences.length;i++)
        {
            String a=sentences[i];
            c=1;
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)==' ')
                {
                    c++;
                }
            }
          max=Math.max(c,max);

        }
        return max;
    }
}
