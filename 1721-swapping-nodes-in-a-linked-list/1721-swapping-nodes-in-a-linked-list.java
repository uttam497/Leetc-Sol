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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        int size=0;
        while(slow!=null)
        {
            slow=slow.next;
            size++;
        }
        int start=k-1;
        int end=size-k;
       ListNode slow1=head;
        while(start>0 && slow1!=null)
        {
            slow1=slow1.next;
            start--;
        }
        ListNode fast=head;
        while(end>0 && fast!=null)
        {
            fast=fast.next;
            end--;
        }
        int temp=slow1.val;
        slow1.val=fast.val;
        fast.val=temp;
        
        return head;
    }
}