class Solution {
    public int addDigits(int num)
    {
     
	 int h=0;
     if(num==1||num==2||num==3||num==4||num==5||num==6||num==7||num==8||num==9)
     {
       h=num;  
     }
	 while(num>9)
		 {
			 int d=num;
			 h=0;
			 while(d>0)
			 {
				int r=d%10;
				h=h+r; 
				d/=10;
			 }
			 num=h;
			 
		 }
	 return h;
	
    }
}
