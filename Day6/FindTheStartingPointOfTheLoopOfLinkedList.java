// https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        int len=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                len=lengthCycle(slow);
                break;
            }
        }
        if(len==0){
            return null;
        }
        ListNode s=head;
        ListNode f=head;
        while(len>0){
            s=s.next;
            len--;
        }
        while(s!=f){
            s=s.next;
            f=f.next;
        }
        return s;
    }
    public int lengthCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode temp=slow;
                int len=0;
                do{
                    temp=temp.next;
                    len++;
                }while(temp!=slow);
                return len;
            }
        }
        return 0;
    }
}
