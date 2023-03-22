//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine()); 

        while(t > 0){
            
            String input_line1[] = br.readLine().trim().split("\\s+");
            int X = Integer.parseInt(input_line1[0]);
            int Y = Integer.parseInt(input_line1[1]);
            
            String S = br.readLine(); 
            
            Solution ob = new Solution();
		
            System.out.println(ob.solve(X,Y,S)); 

            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static long remove(String S, int c1, int c2, int x, int y){
        Stack<Character> s=new Stack<>();
        long count=0;
        long res=0;
        
        //iterate
        for(int i=0; i<S.length(); i++){
            char curr=S.charAt(i);
            
            //remove
            if(s.size()>0 && curr==c2 && s.peek()==c1){
                count++;
                s.pop();
            }
            else{
                s.push(curr);
            }
        }
        
        if(x > y){
            res=res+(count*x);
        }
        else{
            res=res+(count*y);
        }
        count=0;
        
        
        //check for opposite pairs
        StringBuffer sb=new StringBuffer();
        
        while(s.size() > 0){
            sb.append(s.pop());
        }
        sb.reverse();
        
        
        //iterate
        for(int i=0; i<sb.length(); i++){
            char curr=sb.charAt(i);
            
            //remove
            if(s.size()>0 && curr==c1 && s.peek()==c2){
                count++;
                s.pop();
            }
            else{
                s.push(curr);
            }
        }
        
        if(x > y){
            res=res+(count*y);
        }
        else{
            res=res+(count*x);
        }
        
        return res;
        
    }
    
    static long solve(int X,int Y, String S)
	{    
	    long res=0;
	    
	    if(X > Y){
	        //remove pr
	        res=remove(S, 'p', 'r', X, Y);
	    }
	    else{
	        //remove rp
	        res=remove(S, 'r', 'p', X, Y);
	    }
	    
	    return res;
        
	}
}  
