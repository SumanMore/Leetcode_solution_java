class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ob=new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                ob.add("FizzBuzz");
            }
            else if(i%3==0 )
            {
                ob.add("Fizz");
            }
            else if(i%5==0)
            {
                ob.add("Buzz");
            }
            else
            {
                String res=Integer.toString(i);
                ob.add(res);
            }
        }
        return ob;
    }
}
