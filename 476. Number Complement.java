class Solution {
    public int findComplement(int num) {
      String str = Integer.toBinaryString(num);
        str=str.replace("0","*");
        str=str.replace("1","0");
        str=str.replace("*","1");
        return Integer.parseInt(str,2);
    }
}
