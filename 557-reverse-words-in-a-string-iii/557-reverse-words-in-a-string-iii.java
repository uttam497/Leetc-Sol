class Solution {
    public String reverseWords(String s) {
        char ch[]=s.toCharArray();
        int len=s.length();
        int last=-1;
        for(int curr=0;curr<=len;curr++)
        {
            if(curr == len || ch[curr]==' ')
            {
                int start=last+1;
                int end=curr-1;
                while(start<end)
                {
                    char temp=ch[start];
                    ch[start]=ch[end];
                    ch[end]=temp;
                    start++;
                    end--;
                }
                last=curr;
            }
        }
        return new String(ch);
    }
}