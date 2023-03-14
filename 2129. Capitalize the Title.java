class Solution {
    public String capitalizeTitle(String title) 
    {
      String[] arr = title.split(" "); 
        for(int i = 0; i < arr.length; i++) 
        {
            String str = arr[i];
            if(str.length() <= 2) 
            {
                arr[i] = str.toLowerCase();
            }
            else 
            {
                arr[i] = Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
            }
        }
        
        String ans = String.join(" ", arr);
        return ans;     
    }
}
