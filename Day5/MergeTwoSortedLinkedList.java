// https://leetcode.com/problems/merge-two-sorted-lists/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null){
            return null;
        }
        else if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        ListNode node=list1;
        while(node.next!=null){
            node=node.next;
        }
        node.next=list2;
        ListNode curr=list1;
        ListNode index=null;
        while(curr!=null){
            index=curr.next;
            while(index!=null){
                if(curr.val>index.val){
                    int temp=curr.val;
                    curr.val=index.val;
                    index.val=temp;
                }
                index=index.next;
            }
            curr=curr.next;
        }
        return list1;
    }
}
