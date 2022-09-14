/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int result=0;
    int digits[];
    public int pseudoPalindromicPaths (TreeNode root) {
        digits=new int[10];
        dfs(root);
        return result;
    }
    public void dfs(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        
        digits[root.val]++;
        
        if(root.left==null && root.right==null){
            if(isPallindrome())
            {
                result++;
            }
        }
        else{
            dfs(root.left);
            dfs(root.right);
        }
        digits[root.val]--;
    }
   public boolean isPallindrome()
    {
       int odd=0;
        for(int i=1;i<=9;i++)
        {
            if(digits[i]%2!=0)
            {
                odd++;
            }
        }
       if(odd>1)
       {
           return false;
       }
       else return true;
    }
}