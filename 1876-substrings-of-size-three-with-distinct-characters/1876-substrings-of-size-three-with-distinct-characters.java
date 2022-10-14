class Solution {
    public int countGoodSubstrings(String s) {
        char[] ch = s.toCharArray(); 
        int size=ch.length;
        int a=0;
        for(int i=size-3;i>=0;i--)
        {
            if((ch[i]!=ch[i+1] && ch[i+1]!=ch[i+2])  && (ch[i]!=ch[i+2]))
            {
                a++;
            }
                
        }
        return a;
    }
}