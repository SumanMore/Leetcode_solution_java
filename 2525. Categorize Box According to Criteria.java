class Solution {
    public String categorizeBox(int length, int width, int height, int mass) 
    {   long volume = (long)length*width*height;
        boolean bulky = (length >=10000|| width >= 10000 || height >= 10000|| volume >= 1000000000) ? true : false;
        boolean heavy = mass >= 100 ? true : false; 
        if (bulky && heavy) 
            return "Both";
        if (bulky) 
            return "Bulky";
        if (heavy) 
            return "Heavy";
        return "Neither";
    }
}
