package LeetCode;

public class No24 {
    public static void main(String args[]){
        swapPairs(ListNode.of(1,2,3,4));
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode cur = preNode;

        while(cur.next != null && cur.next.next != null){
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            temp.next = cur.next.next;
            cur.next.next = temp;
            cur = cur.next.next;
        }

        return preNode.next;
    }
}
