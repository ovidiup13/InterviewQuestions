package data_structures.linkedlists;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * Try solving it using constant additional space.
 */
public class ListCycle {

    public ListNode detectCycle(ListNode a) {

        ListNode fast = a;
        ListNode slow = a;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        ListNode start = a;

        while (start != slow) {
            slow = slow.next;
            start = start.next;
        }

        return start;
    }

}
