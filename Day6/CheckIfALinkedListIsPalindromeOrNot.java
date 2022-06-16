// https://leetcode.com/problems/palindrome-linked-list/

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode headTwo=reverseList(mid);
        ListNode reReverseHead=headTwo;
        while(head!=null && headTwo!=null){
            if(head.val!=headTwo.val){
                break;
            }
            head=head.next;
            headTwo=headTwo.next;
        }
        return head==null || headTwo==null;
    }
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode n=head.next;
            head.next=prev;
            prev=head;
            head=n;
        }
        return prev;
    }
}
