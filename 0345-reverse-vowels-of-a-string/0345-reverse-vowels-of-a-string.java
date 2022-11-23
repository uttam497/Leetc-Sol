class Solution {

public String reverseVowels(String s) {
    char chars[]=s.toCharArray();
    Set<Character> vo=new HashSet<Character>();
    vo.add('a');
    vo.add('e');
    vo.add('i');
    vo.add('o');
    vo.add('u');
    vo.add('A');
    vo.add('E');
    vo.add('I');
    vo.add('O');
    vo.add('U');
    int i=0;
    int j=s.length()-1;
    
    while(i<j){
        if(vo.contains(chars[i]) && vo.contains(chars[j])){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;j--;
        }
        while(i<j && !vo.contains(chars[i])){
            i++;
        }
        while(i<j && !vo.contains(chars[j])){
            j--;
        }
    }
    
    return String.valueOf(chars);
}
}