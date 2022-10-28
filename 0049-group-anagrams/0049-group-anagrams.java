class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String, List<String>> map = new HashMap<>(); //map init
        
        for(String s : strs){ //iterating over the array of strings
            char [] ch = s.toCharArray(); //convert string to char array
            Arrays.sort(ch); //sort it

            String sn = new String(ch); //rebild it as string
            
            if(!map.containsKey(sn)) { //if key is not in map put new key
                map.put(sn,new LinkedList<>());
            }
            map.get(sn).add(s); //add s to the anagram group it belongs.
        }
        
        List<List<String>> ans = new LinkedList<>();//building ans
        for(String key : map.keySet()){ //iterating over keys
            ans.add(map.get(key)); //adding the groups to result
        }
        return ans; //returning ans.
    }
}