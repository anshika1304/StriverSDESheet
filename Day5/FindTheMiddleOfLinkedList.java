// https://leetcode.com/problems/middle-of-the-linked-list/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] node=new ListNode[100];
        int t=0;
        while(head!=null){
            node[t]=head;
            head=head.next;
            t++;
        }
        return node[t/2];
    }
}
