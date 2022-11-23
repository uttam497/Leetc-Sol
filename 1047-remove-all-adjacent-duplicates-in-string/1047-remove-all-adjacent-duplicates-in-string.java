class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0 ; i<n; i++)
        {
          char c = s.charAt(i);
          if(st.empty())
//CHECK FOR EMEPTY STACK IF YES PUSH FIRST ELEMENT.
          {
          st.push(c);
          }
          else {
            if(st.peek()==c)
//IF NEXT ELE IS EQUAL TO PEEK OF STACK THE REMOVE THE PEEK ELE.
             st.pop();
            else 
              st.push(c);
//IF NOT EQUAL PUSH INTO STACK
          }
      }
       String ans="";
//MAKE A NEW STRING FOR STORING UNIQUE ELE.
      while(!st.empty())
//UNTILL STACK IS NOT EMPTY POPPOP ELE AND ADD TO THE ANSWER. 
      {
     
      ans=st.pop()+ans;
//ADD FIRST POP ELE THEN THE  PREV. ELE. BCZ WE HAVE TO REV. THEM AGAIN
      }
      return ans;
    }
}