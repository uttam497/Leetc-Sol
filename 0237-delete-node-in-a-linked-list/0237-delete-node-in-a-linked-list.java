/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node;
        while(node!=null)
        {
            if(node.next!=null)
            {
                node.val=node.next.val;
                temp=node;
                node=node.next;
            }
            else{
                temp.next=node.next;
                break;
            }
        }
    }
}