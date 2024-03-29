//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long max=Integer.MIN_VALUE;
        long sum=0;
        int start=0;
        int end=0;
        while(end<N)
        {
            sum=sum+Arr.get(end);
            if(end-start+1<K)   end++;
            
           else if(end-start+1==K)
            {
                   if(max<sum)
                   {
                       max=sum;
                   }
                   sum=sum-Arr.get(start);
                   start++;
                   end++;
            }
            
            
        }
           
        
        return max;
        // code here
    }
}