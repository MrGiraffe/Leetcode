package MergeTwoSortedLists;



public class MergeTwoSortedLists {
    
    public static class ListNode {
    // Everything should be public?
    //Normally acessor methods etc should be present but fine for the interview I guess
        int val;
        ListNode next;

        // Often people use same name for parameter and member variable and 
        // for assignement use this.val = val;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // Use better, longer variables. It is pretty hard to follow.
        // One variable per line.
        ListNode l, head, tmp, buf = new ListNode(0);

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if ((l1 == null) && (l2 == null)) {
            return null;
        }

        if (l1.val <= l2.val) {
            l = l1;
            tmp = l2;
        } else {
            l = l2;
            tmp = l1;
        }

        head = l;

        while (!(l.next == null)) {

            if (l.next.val <= tmp.val) {
                // not sure if it is any optimization compare to the dump most and simple implementation
                // What is the optimization? One assigment? Could be even worth if "else" branch is executed often.
                l = l.next;
            } else {
                // buf should rather be local variable to this scope.
                buf = l.next;
                l.next = tmp;
                tmp = buf;
            }
        }
        if (!(tmp == null)) {
            l.next = tmp;
        }
        return head;
    }

    public static void main(String args[]) {

        ListNode l1 = new ListNode(1);
        ListNode ln1 = new ListNode(2);
        ListNode ln2 = new ListNode(3);
        ListNode ln3 = new ListNode(4);
        l1.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        ListNode l2 = new ListNode(1);
        ListNode ln11 = new ListNode(2);
        ListNode ln22 = new ListNode(3);
        ListNode ln33 = new ListNode(4);
        l2.next = ln11;
        ln11.next = ln22;
        ln22.next = ln33;

        ListNode l3 = mergeTwoLists(l1, l2);

        while (l3 != null) {
            System.out.print(l3.val);
            l3 = l3.next;
        }
    }
}
