import java.math.BigInteger;  
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger ob1= new BigInteger(num1);
        BigInteger ob2= new BigInteger(num2);
        BigInteger ob3=ob1.add(ob2);
        return ob3.toString();
    }
}
