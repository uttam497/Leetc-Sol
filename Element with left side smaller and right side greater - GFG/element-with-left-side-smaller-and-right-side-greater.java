//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.findElement(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Compute {
    public int findElement(int arr[], int n){
        for(int i=1;i<=n-2;i++){
            int left=i-1;
            int right=i+1;
            int l=0,r=0;
            while(left>=0){
                if(arr[i]<arr[left]){
                    l=1;
                    break;
                }
                left--;
            }
            if(l==0){
            while(right<=n-1){
                if(arr[i]>arr[right]){
                    l=1;
                    break;
                }
                right++;
                
            }
        }
        
        if(l==0){
            return arr[i];
        }
            
        }
        return -1;
        
    }
}