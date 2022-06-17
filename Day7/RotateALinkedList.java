// https://leetcode.com/problems/rotate-list/description/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode node=head;
        int len=1;
        while(node.next!=null){
            len++;
            node=node.next;
        }
        node.next=head;
        k=len-k%len;
        while(k-->0){
            node=node.next;
        }
        head=node.next;
        node.next=null;
        return head;
    }
}
