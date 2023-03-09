class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double l=salary.length-2;
        int sum=0;
        for(int i=1;i<salary.length-1;i++)
        {
          sum=sum+salary[i];
        }
        return sum/l;
    }
}
