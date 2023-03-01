class Solution {
    public double[] convertTemperature(double celsius) {
        double ar[]=new double[2];
        ar[0]=celsius+273.15;
        ar[1]=celsius*1.80 +32.00;
        return ar;
    }
}
