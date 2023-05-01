package LeetCode;

public class No2 {
    public static void main(String args[]){
        ListNode l1 = ListNode.of(2,4,3);
        ListNode l2 = ListNode.of(5,6,4);
        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode answer = listNode;
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum %= 10;

            listNode.next = new ListNode(sum);
            listNode = listNode.next;
        }

        if(carry > 0) listNode.next = new ListNode(carry);

        return answer.next;
    }
}
