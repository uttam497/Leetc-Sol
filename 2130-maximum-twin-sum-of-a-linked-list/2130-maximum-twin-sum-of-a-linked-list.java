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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int a=0;
        while(fast!=null && fast.next!=null)
        {
            a++;
            slow=slow.next;
            fast=fast.next.next;
        }
        int len=a*2;
        int nums[]=new int[len];
        a=0;
        while(head!=null)
        {
            nums[a++]=head.val;
            head=head.next;
        }
        int start=0;
        int end=len-1;
        a=0;
        int max=Integer.MIN_VALUE;
        while(start<end)
        {
            a=nums[start]+nums[end];
            if(a>max)
            {
                max=a;
            }
            start++;
            end--;
        }
        return max;
    }
}