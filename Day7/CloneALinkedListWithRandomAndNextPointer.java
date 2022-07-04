// https://leetcode.com/problems/copy-list-with-random-pointer/

class Solution {
    public Node copyRandomList(Node head) {
        Node runner=head;
        while(runner!=null){
            Node temp=new Node(runner.val);
            temp.next=runner.next;
            runner.next=temp;
            runner=runner.next.next;
        }
        runner=head;
        while(runner!=null){
            if(runner.random!=null){
                runner.next.random=runner.random.next;
            }
            runner=runner.next.next;
        }
        runner=head;
        Node copy=new Node(0);
        Node prev=copy;
        while(runner!=null){
            prev.next=runner.next;
            prev=prev.next;
            runner.next=prev.next;
            runner=runner.next;
        }
        return copy.next;
    }
}
