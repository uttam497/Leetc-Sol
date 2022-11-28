//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> findSubarray(int a[], int n) {

        int max=0,start=0,end=-1,i=0,j=0,sum=0;
        while(j<n){
            if(a[j]>=0){
                sum+=a[j];
                j++;
            }else{
                if(sum>max){
                    max=sum;
                    start=i;
                    end=j-1;
                }
                sum=0;
                 j++;
                 i=j;
            }
        }
        
        //extra
        if(sum>max){
            start=i;
            end=j-1;
        }
         ArrayList<Integer> list=new ArrayList<>();
         for(int k=start;k<=end;k++){
             list.add(a[k]);
         }
         
         if(list.size()==0){
             list.add(-1);
         }
        return list;
    }
}