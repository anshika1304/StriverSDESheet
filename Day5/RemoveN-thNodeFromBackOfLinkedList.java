// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        int ptr=len-n;
        if(ptr==0){
            head=head.next;
            return head;
        }
        temp=head;
        for(int i=1; i<ptr; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
