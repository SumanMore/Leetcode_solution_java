class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       Map<Integer, String> ob = new HashMap<>();
        for (int i = 0; i < names.length; i++) 
        {
            ob.put(heights[i], names[i]);
        }        
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) 
        {
            result[index] = ob.get(heights[i]);
            index++;
        }
        return result;
    }
}
