class Solution {
    public int mySqrt(int x) {
        double p=0;
        
        for(double i=1;i<=x/2+1;i++)
        {
            if(i*i==x){
                p=i;
                break;
            }
            if(i*i>x)  
            {
                p=i-1;
             break;
            }
        }
        return (int)p;
    }
}