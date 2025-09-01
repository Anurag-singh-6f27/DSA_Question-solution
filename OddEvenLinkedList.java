package Dsa_Questions;

public class OddEvenLinkedList extends LinkedList{
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode ans=new ListNode(0);
        ans.next=odd;
        ListNode evenNode=new ListNode(0);
        evenNode.next=even;
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            if(odd.next!=null){
                even.next=odd.next.next;
                odd=odd.next;
            }
            else{
                even.next=null;
                break;
            }
            if(even!=null)even=even.next;
        }
        odd.next=evenNode.next;
        return ans.next;

    }

    public static void main(String[] args) {

    }
}
