//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int ar[], int size)
    {
       
        HashSet<Integer> set=new HashSet<Integer>();
        for(int x=0;x<size;x++)
        {
            set.add(ar[x]);
        }
        
        
        int temp[]=new int[set.size()];
        int k=0;
        for(int ele:set){
          temp[k++] = ele;
        }
        int len=temp.length;
         Arrays.sort(temp);
        int n=temp[len-1]+1;
       
        int i;
        for(i=0;i<len;i++){
            if(temp[i]>0) {
                break;
            }
        }
        
        if(i==len){
            i=0;
        }
        int a=1;
          for(int j=i;j<len;j++){
              
              if(temp[j]!=a){
                  n=a;
                  break;
              }
              ++a;
          }
            
        
        // Your code here
         return n;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends