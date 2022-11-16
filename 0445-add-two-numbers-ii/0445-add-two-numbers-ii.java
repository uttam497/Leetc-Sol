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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=l1;
        ListNode trav=l1;
        ListNode ptr1=null;
        ListNode ptr2=null;
        while(temp!=null)
        {
            trav=temp.next;
            temp.next=ptr1;
            ptr1=temp;
            temp=trav;
        }
        temp=l2;
        trav=l2;
        while(temp!=null)
        {
            trav=temp.next;
            temp.next=ptr2;
            ptr2=temp;
            temp=trav;
        }
        int carry=0;
        ListNode l3=new ListNode(0);
        ListNode nptr=l3;
        while(ptr1!=null || ptr2!=null || carry>0)
        {
            if(ptr1!=null)
            {
                carry=carry+ptr1.val;
                ptr1=ptr1.next;
            }
            if(ptr2!=null)
            {
                carry=carry+ptr2.val;
                ptr2=ptr2.next;
            }
            nptr.next=new ListNode(carry%10);
            carry=carry/10;
            nptr=nptr.next;
        }
        l3 = l3.next;
        temp=l3;
        trav=l3;
        ListNode ptr=null;
        while(temp!=null)
        {
            trav=temp.next;
            temp.next=ptr;
            ptr=temp;
            temp=trav;
        }
        return ptr;
    }
}