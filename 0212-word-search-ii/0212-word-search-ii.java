class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        List<String> list = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            addWordToTrie(words[i], root);
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                exploreCell(board, i, j, list, root);
            }
        }
        return list;
    }

    public void exploreCell(char[][] board, int i, int j, List<String> list, TrieNode node){
        if(i<0 || j<0 || i>=board.length || j>= board[0].length || board[i][j]=='#'){
            return;
        }
        char ch = board[i][j];

        if(node.children[ch-'a']==null){
            return;
        } else {
            node = node.children[ch-'a'];
        }

        if(node.isEndOfWord){
            node.isEndOfWord = false;
            list.add(node.str);
        }
        
        board[i][j] = '#';
        exploreCell(board, i-1, j, list, node);
        exploreCell(board, i, j+1, list, node);
        exploreCell(board, i+1, j, list, node);
        exploreCell(board, i, j-1, list, node);
        board[i][j] = ch;
    }



    public void addWordToTrie(String word, TrieNode node){
        
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

          if(node.children[ch-'a']==null){
              node.children[ch-'a'] = new TrieNode();
              node = node.children[ch-'a'];
          } else {
              node = node.children[ch-'a'];
          }
        }
        node.str = word;
        node.isEndOfWord = true;
    }
}

class TrieNode
{
    TrieNode[] children = new TrieNode[26];
    String str;
    boolean isEndOfWord;
}