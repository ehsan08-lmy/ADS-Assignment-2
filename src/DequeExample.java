import java.util.*;

class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(1);
        dq.addLast(2);
        dq.removeFirst();
        dq.removeLast();
    }
}