//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] matrix)
    {
        // code here
        int n=R*C;
        int ar[]=new int[n];
        int top=0,down=R-1,left=0,right=C-1;
        int dir=0;
        int c=0;
        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    ar[c++]=matrix[top][i];
                    
                }
                top=top+1;
             }
            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    ar[c++]=matrix[i][right];
                    
                }
                right--;
             }
           else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    ar[c++]=matrix[down][i];
                    
                }
                down=down-1;
             }
           else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    ar[c++]=matrix[i][left];
                    
                }
                left=left+1;
             }
            dir=(dir+1)%4;
        }
        for(int j=0;j<n/2;j++)
        {
            int temp=ar[j];
            ar[j]=ar[n-j-1];
            ar[n-j-1]=temp;
        }
        return ar;
    }
}