import java.util.*; // Time complexity O(n^2)
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}    


class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int res[]=new int[2];
        int c=0;
        HashMap<Integer,Integer> ob=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(ob.containsKey(target-nums[i]))
            {
                res[1]=i;
                res[0]=ob.get(target-nums[i]);
                
            }
            ob.put(nums[i],i);
        }
        
        return res;
        
    }
}
