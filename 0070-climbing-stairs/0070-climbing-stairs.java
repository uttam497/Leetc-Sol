class Solution {
    public int climbStairs(int n) {
        int q2=0;
     int q1=0;
        int memo[]=new int[46];
return climb(q1,q2,n,memo);
    }
    public int climb(int q1,int q2,int n,int memo[])
    {
        if(n==0)
        {
            memo[0]=0;
            return 0;
        }
         if(n == 1){
             memo[1]=1;
        return 1;
    }
    if(n == 2){
        memo[2]=2;
        return 2;
    }
        if(memo[n]!=0)
        {
            return memo[n];
        }
        
       
    q1=climb(q1,q2,n-1,memo);
    q2=climb(q1,q2,n-2,memo);
        memo[n]=q1+q2;
        return memo[n];
    }
}