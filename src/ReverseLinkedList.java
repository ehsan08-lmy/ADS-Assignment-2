import java.util.*;

class ReverseLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int v) { val = v; }
    }

    static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.nextInt());
            if (head == null) head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
        }

        head = reverse(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}