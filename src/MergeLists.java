class MergeLists {
    static class Node {
        int val;
        Node next;
        Node(int v) { val = v; }
    }

    static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0), curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}