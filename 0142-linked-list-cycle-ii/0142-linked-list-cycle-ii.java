/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    HashMap<ListNode,Integer> map=new HashMap<ListNode,Integer>();
        ListNode temp=head;
        
        int c=-1;
        while(temp!=null)
        {
            if(map.containsKey(temp))
            {
                return temp;
            }
            else{
                map.put(temp,c++);
            }
            temp=temp.next;
        }
        return null;
    }
}