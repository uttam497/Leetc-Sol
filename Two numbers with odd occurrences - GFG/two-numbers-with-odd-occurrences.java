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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
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

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int ar[]=new int[2];
        int i=0;
        for(i=0;i<N;i++)
        {
            map.put(Arr[i],map.getOrDefault(Arr[i],0)+1);
        }
        i=0;
       for(Map.Entry<Integer,Integer> e : map.entrySet())
        
        {
            if(e.getValue()%2!=0){
                ar[i++]=(Integer)e.getKey();
                if(i==2)    break;
    
            }    
        }
        if(ar[0]<ar[1])
        {
            int temp=ar[0];
            ar[0]=ar[1];
            ar[1]=temp;
        }
        return ar;
    }
}



//  HashMap<Integer,Integer> hm = new HashMap<>();
        
//         for(int i=0;i<nums.length;i++)
//         {
//              hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
//         }
//         for(Map.Entry<Integer,Integer> e : hm.entrySet())
        
//         {
//             if(e.getValue()>=2)
//                 return (Integer)e.getKey();
//         }
        
//         return -1;
// }
// }