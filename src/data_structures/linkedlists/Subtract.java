package data_structures.linkedlists;

import static data_structures.linkedlists.Reverse.reverse;

/**
 * Given a singly linked list, modify the value of first half nodes such that :
 * <p>
 * 1st node’s new value = the last node’s value - first node’s current value
 * 2nd node’s new value = the second last node’s value - 2nd node’s current value,
 * and so on …
 */
public class Subtract {

    public ListNode subtract(ListNode a) {

        if (a == null || a.next == null) {
            return a;
        }

        int length = 0;
        ListNode temp = a;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        //System.out.println("Length: " + length);


        // get mid
        int mid = length / 2;
        ListNode prevMid = a;
        for (int i = 0; i < mid - 1; i++) {
            prevMid = prevMid.next;
        }

        prevMid.next = reverse(prevMid.next);

        ListNode first = a;
        ListNode last = prevMid.next;
        while (!first.equals(prevMid.next)) {
            first.val = last.val - first.val;
            first = first.next;
            last = last.next;
        }

        prevMid.next = reverse(prevMid.next);

        return a;
    }

}
