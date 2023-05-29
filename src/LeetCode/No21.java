package LeetCode;

public class No21 {
    public static void main(String agrg[]){
        ListNode l1 = ListNode.of(1,2,4);
        ListNode l2 = ListNode.of(1,3,4);
        System.out.println(mergeTwoLists(l1, l2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dHead = new ListNode(Integer.MIN_VALUE);
        ListNode cur = dHead;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1==null){ cur.next = list2;}
        if(list2==null){ cur.next = list1;}

        return dHead.next;
    }
}
