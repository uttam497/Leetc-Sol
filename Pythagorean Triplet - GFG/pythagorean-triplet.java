//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            int left=0;
            int right=i-1;
            int c=arr[i]*arr[i];
            while(left<right){
                int a=arr[left]*arr[left];
                int b=arr[right]*arr[right];
                if((a+b)==c){
                    return true;
                }
                else if((a+b)<c){
                    left++;
                }
                else if((a+b)>c){
                    right--;
                }
            }
            
        }
        return false;
    }
}