class Solution {
    public int fib(int n) {
        if(n==0)    return 0;
        int ar[]=new int[n+1];
        ar[0]=0;
        ar[1]=1;
        for(int i=2;i<=n;i++)
        {
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar[n];
    }
}