class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;                                  
        ArrayList<Integer> ob = new ArrayList<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("+"))
            {
                ob.add(ob.get(ob.size()-1)+ob.get(ob.size()-2));
            }
            else if(operations[i].equals("D"))
            {
                ob.add(2*ob.get(ob.size()-1));
            }
            else if(operations[i].equals("C"))
            {
                ob.remove(ob.size()-1);
            }
            else
            {
                ob.add(Integer.parseInt(operations[i]));
            }
        }
        for(int i=0;i<ob.size();i++){
            ans +=ob.get(i);
        }
        return ans;
    }
}
