class Solution 
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String string1="";
        String string2="";
   
       for(int i=0;i<word1.length;i++)
       {
           string1+=word1[i];
       }
        for(int i=0;i<word2.length;i++)
       {
  
           string2+=word2[i];
       }
        if(string1.equals(string2))
            return true;
        else
            return false;
    }
}