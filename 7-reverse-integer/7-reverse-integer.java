class Solution {
    public int reverse(int x) {
        long r=0;
    
        
        while(x!=0)
        {
            int rem=x%10;
            r=r*10+rem;
            x=x/10;
        }
        if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
			return (int)r;
		else
			return 0;
    }
}