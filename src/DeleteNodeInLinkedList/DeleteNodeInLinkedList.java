package DeleteNodeInLinkedList;

public class DeleteNodeInLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int num) {
            val = num;
        }
    }

    public static void deleteNode(ListNode node) {
        // Cooll idea!
        node.val = node.next.val;
        node.next = node.next.next;
    }


    public static void main(String args[]) {

        ListNode ln = new ListNode(1);
        ListNode ln1 = new ListNode(2);
        ListNode ln2 = new ListNode(3);
        ListNode ln3 = new ListNode(4);
        ln.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        
        deleteNode(ln2);

        while (ln != null) {
            System.out.print(ln.val);
            ln = ln.next;
        }
    }
}

