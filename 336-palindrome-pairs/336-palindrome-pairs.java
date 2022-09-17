
class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        HashMap<String,Integer> wordMap = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        int n = words.length;
        
        for(int i=0;i<n;i++){
            wordMap.put(words[i],i);
            set.add(words[i].length());
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int length = words[i].length();
            
            if(length ==1){
                if(wordMap.containsKey("")){
                    ans.add(Arrays.asList(i, wordMap.get("")));
                    ans.add(Arrays.asList(wordMap.get(""), i));
                }
                continue;
            }
            String reverse= new StringBuilder(words[i]).reverse().toString();
            if(wordMap.containsKey(reverse) && wordMap.get(reverse) != i)
                ans.add(Arrays.asList(i,wordMap.get(reverse)));
            
            for(Integer k:set){
                if(k==length)
                    break;
                if(isPalindrome(reverse,0,length-1-k)){
                    String s1 = reverse.substring(length-k);
                    if(wordMap.containsKey(s1))
                        ans.add(Arrays.asList(i,wordMap.get(s1)));
                }
                
                if(isPalindrome(reverse,k,length-1)){
                    String s2 = reverse.substring(0,k);
                    if(wordMap.containsKey(s2))
                        ans.add(Arrays.asList(wordMap.get(s2),i));
                }
            }
        }
        return ans;
    }
    
    private boolean isPalindrome(String s, int left, int right){
        while(left<right)
            if(s.charAt(left++)!=s.charAt(right--))
                return false;
        return true;
    }
}
















/*brute force 
class Solution {
public:
    bool isPalindrome(string word) {
        int i = 0;
        int j = word.size() - 1;
        while (i < j) {
            if (word[i] != word[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    vector<vector<int>> palindromePairs(vector<string>& words) {
        vector<vector<int>> result;
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if (i == j) {
                    continue;
                }
                string word = words[i] + words[j];
                if (isPalindrome(word)) {
                    result.push_back({i, j});
                }
            }
        }
        return result;
    }
};*/