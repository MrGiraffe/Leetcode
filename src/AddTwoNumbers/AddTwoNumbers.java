package AddTwoNumbers;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        // Use Optional<ListNode>
        ListNode next;

        ListNode(int num) {
            val = num;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode ln = new ListNode(0), preLast = new ListNode(0);
        // Declare one variable on one lime.
        ListNode ln1 = l1, ln2 = l2, curr = ln;
        int sum, buf = 0;

        while (!(ln1 == null) || !(ln2 == null)) {

            // I think with Optional magic check for null should not be necessary. Figure out how it works.
            // Wouldn't hurt to check the preconditions 0 <= val < 10. Use assert.
            sum = ((ln1 != null) ? ln1.val : 0) + ((ln2 != null) ? ln2.val : 0) + buf;
            if (sum >= 10) {
                //  curr.val = isntead of +=. Same below. 
                curr.val += (sum % 10);
                // buf = 1; instead?
                buf = sum / 10;

            } else {
                curr.val += sum;
                buf = 0;

            }
            curr.next = new ListNode(0);

            // Use optional.
            if (!(ln1 == null)) ln1 = ln1.next;
            if (!(ln2 == null)) ln2 = ln2.next;

            preLast = curr;
            curr = curr.next;

        }

        if (buf > 0) curr.val = buf;
        if (curr.val == 0) preLast.next = null;

        return ln;
    }

    // Try using JUnit test framework.
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
