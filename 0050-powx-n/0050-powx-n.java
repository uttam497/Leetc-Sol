class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long nn=n;
        if(nn<0)    nn=-1*nn;
        double a=Pow(x,nn,ans);
        ans=a;
        if(n<0)
            ans=(double)(1.0)/(double)(ans);
        return ans;
    }
    public double Pow(double x,long n,double ans)
    {
        if(n>0){
            if(n%2==1)
            {
                ans=ans*x;
                n=n-1;
                return Pow(x,n,ans);
            }
        else{
            x=x*x;
            n=n/2;
           return Pow(x,n,ans);
        }
        }
        return ans;
    }
}