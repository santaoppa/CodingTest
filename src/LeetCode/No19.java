package LeetCode;

public class No19 {
    public static void main(String args[]){
        ListNode l1 = ListNode.of(1,2,3,4,5);
        removeNthFromEnd(l1, 2);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode p1 = dummy;
        ListNode p2 = dummy;

        for (int i=0; i<n+1; i++) {
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.next = p2.next.next;

        return dummy.next;
    }
}
