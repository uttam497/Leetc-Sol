class Solution {
    
    public int fib(int n) {
        int memo[]=new int[n+1];
        Arrays.fill(memo,-1);
    return calfibo(memo,n);
    
    }
    public int calfibo(int memo[],int n)
    {
        if(n==0)    return 0;
        if(n==1 || n==2)    return 1;
        if(memo[n]!=-1)    return memo[n];
        int ans=calfibo(memo,n-1)+calfibo(memo,n-2);
        memo[n]=ans;
        return ans;
    }
}