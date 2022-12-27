//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//testcases
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int n,k;
		    //taking input n and k
		    n=sc.nextInt();
		    k=sc.nextInt();
		    
		    //calling josephus() function
		    System.out.println(obj.josephus(n,k));
		    
		    
		}
		
	}
}


// } Driver Code Ends


class Solution {
    public int  josephus(int n, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
            list.add(i);
        int  ind=0;
        return solve(list,k-1,ind,n);
        
    }
    public int solve(ArrayList<Integer> list,int k,int index,int n)
    {
        if(list.size()==1)
            return list.get(0); 
            index=((index+k)%(list.size()));
        list.remove(index);
       
       int ans= solve(list,k,index,n--);
        return ans;
    }
}

