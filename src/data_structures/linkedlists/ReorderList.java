package data_structures.linkedlists;

/**
 * Given a singly linked list
 * <p>
 * L: L0 → L1 → … → Ln-1 → Ln,
 * reorder it to:
 * L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
 * <p>
 * You must do this in-place without altering the nodes’ values.
 */
public class ReorderList {

    public ListNode reorderList(ListNode a) {

        if (a == null || a.next == null) {
            return a;
        }

        int n = getLength(a);
        ListNode mid = getMid(a);
        mid.next = reverse(mid.next);

        ListNode first = a;

        int midPos = n % 2 == 0 ? n / 2 - 1 : n / 2;
        int i = 0;

        while (i < midPos) {
            ListNode temp = first.next;
            first.next = mid.next;
            mid.next = mid.next.next;
            first.next.next = temp;

            first = first.next.next;
            i++;
        }

        return a;
    }

    private ListNode reverse(ListNode a) {
        if (a == null || a.next == null) {
            return a;
        }

        ListNode p1 = a;
        ListNode p2 = a.next;

        p1.next = null;

        while (p2 != null) {
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }

        return p1;
    }

    private int getLength(ListNode a) {
        if (a == null) {
            return 0;
        } else if (a.next == null) {
            return 1;
        }

        int count = 0;
        ListNode temp = a;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    private ListNode getMid(ListNode a) {
        if (a == null || a.next == null) {
            return a;
        }

        int length = getLength(a);
        int k = length / 2;

        ListNode temp = a;
        while (k > 0) {
            temp = temp.next;
            k--;
        }

        return temp;
    }

}
