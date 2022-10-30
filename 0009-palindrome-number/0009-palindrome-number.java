class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n=x;
        int a=0;
        while(n!=0)
        {
            int rem=n%10;
            a=a*10+rem;
            n=n/10;
        }
        if(a==x)    return true;
        else    return false;
    }
}