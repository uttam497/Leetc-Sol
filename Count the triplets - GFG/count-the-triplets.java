//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int ar[], int n) {
        // code here
        
        Arrays.sort(ar);
        int count=0;
        for(int i=n-1;i>=0;i--){
            int left=0;
            int right=i-1;
            while(left<right){
                int sum=ar[left]+ar[right];
                if(sum==ar[i]){
                    count++;
                    left++;
                    right--;
                }
                else if(sum>ar[i]){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}