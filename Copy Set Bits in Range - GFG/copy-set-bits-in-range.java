//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line[] = in.readLine().trim().split("\\s+");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int l = Integer.parseInt(line[2]);
            int r = Integer.parseInt(line[3]);
            
            Solution ob = new Solution();
            System.out.println(ob.setSetBit(x, y, l, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int setSetBit(int x, int y, int l, int r){
        
        int ary[]=new int[32];
        int i=32-1;
        while(y>0){
            if(y%2==0){
            ary[i--]=0;
            }
            else{
                ary[i--]=1;
            }
            y=y/2;
        }
        int sum=x;
        int arx[]=new int[32];
        i=32-1;
        while(x>0){
            if(x%2==0){
            arx[i--]=0;
            }
            else{
                arx[i--]=1;
            }
            x=x/2;
        }
        
        for(int j=32-l;j>=32-r;j--){
            if(ary[j]==1 && arx[j]==0){
                sum+=Math.pow(2,(31)-j);
                
            }
            else{
                continue;
            }
        }
        return sum;
        // code here
    }
}