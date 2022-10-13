//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Arrays.sort(arr);
		    Complete obj = new Complete();
		    int ans = obj.maximizeSum(arr, sizeOfArray);
		    System.out.println(ans);
		}
	}
}




// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        //Complete the function
       int max = -1;
        for(int i = 0; i < n; i++)
        {
            max = Math.max(max, arr[i]);
        }
         
        // An array to count the occurrence of each element
        int []freq = new int[max + 1];
         
        for(int i = 0; i < n; i++)
        {
            freq[arr[i]]++;
        }
         
        // ans to store the result
        int ans = 0, i=max;
         
        // Using the above mentioned approach
        while(i>0){
             
            // if occurrence is greater than 0
            if(freq[i] > 0){
                // add it to ans
                ans += i;
                 
                // decrease i-1th element by 1
                freq[i-1]--;
                 
                // decrease ith element by 1
                freq[i]--;
            }else{               
                // decrease i
                i--;
            }           
        }
         
        return ans;
    }
    
    
    
}


