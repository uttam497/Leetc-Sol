/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix =new int[m][n];
            for(int[] i:matrix){
            Arrays.fill(i,-1);
        }
        ListNode temp=head;
        int top=0,down=m-1,left=0,right=n-1;
        int dir=0;

            
        while(top<=down && left<=right && temp!=null)
        {
            if(dir==0)
            {
                for(int i=left;i<=right && temp!=null;i++)
                {
                    matrix[top][i]=temp.val;
                    temp=temp.next;
                }
                top=top+1;
             }
            else if(dir==1)
            {
                for(int i=top;i<=down && temp!=null;i++)
                {
                    matrix[i][right]=temp.val;
                    temp=temp.next;
                    
                }
                right--;
             }
           else if(dir==2)
            {
                for(int i=right;i>=left && temp!=null;i--)
                {
                    matrix[down][i]=temp.val;
                    temp=temp.next;
                    
                }
                down=down-1;
             }
           else if(dir==3)
            {
                for(int i=down;i>=top && temp!=null;i--)
                {
                    matrix[i][left]=temp.val;
                    temp=temp.next;
                    
                }
                left=left+1;
             }
            dir=(dir+1)%4;
            
        }
        
        return matrix;
        
    }
}