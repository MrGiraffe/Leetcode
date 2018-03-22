package AddTwoNumbers;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int num) {
            val = num;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode ln = new ListNode(0), preLast = new ListNode(0);
        ListNode ln1 = l1, ln2 = l2, curr = ln;
        int sum, buf = 0;

        while (!(ln1 == null) || !(ln2 == null)) {

            sum = ((ln1 != null) ? ln1.val : 0) + ((ln2 != null) ? ln2.val : 0) + buf;
            if (sum >= 10) {
                curr.val += (sum % 10);
                buf = sum / 10;

            } else {
                curr.val += sum;
                buf = 0;

            }
            curr.next = new ListNode(0);

            if (!(ln1 == null)) ln1 = ln1.next;
            if (!(ln2 == null)) ln2 = ln2.next;

            preLast = curr;
            curr = curr.next;

        }

        if (buf > 0) curr.val = buf;
        if (curr.val == 0) preLast.next = null;

        return ln;
    }

    public static void main(String args[]) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(8);
        l1.next = l2;
        ListNode l3 = new ListNode(0);

        ListNode res = addTwoNumbers(l1, l3);

        while (res != null) {
            System.out.print(res.val);
            res = res.next;
        }
    }
}
