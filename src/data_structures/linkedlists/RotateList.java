package data_structures.linkedlists;

/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * <p>
 * For example:
 * <p>
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 */
public class RotateList {

    public ListNode rotateRightImproved(ListNode a, int b){

        if (a == null || a.next == null) {
            return a;
        }

        int n = getLength(a);
        ListNode last = getLast(a);

        b %= n;
        if(b == 0){
            return a;
        }

        int i = n - 1 - b;
        ListNode newLast = a;
        while (i > 0) {
            newLast = newLast.next;
            i--;
        }

        ListNode temp = newLast.next;
        newLast.next = null;
        last.next = a;

        return temp;
    }

    // Time limit exceeded
    public ListNode rotateRight(ListNode a, int b) {

        if (a == null || a.next == null) {
            return a;
        }

        int n = getLength(a);
        b = b % n;

        if (b == 0) {
            return a;
        }

        ListNode first = a;
        while (b > 0) {
            ListNode secondToLast = getSecondToLast(first);
            // System.out.println("Second to last: " + secondToLast.val);
            ListNode last = secondToLast.next;

            // System.out.println("Last: " + last.val);
            secondToLast.next = null;

            last.next = first;
            first = last;

            b--;
        }

        return first;
    }

    private ListNode getLast(ListNode a){
        if (a == null || a.next == null) {
            return a;
        }

        ListNode temp = a;
        while(temp.next != null){
            temp = temp.next;
        }

        return temp;
    }

    private ListNode getSecondToLast(ListNode a) {
        if (a == null || a.next == null || a.next.next == null) {
            return a;
        }

        ListNode temp = a;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        return temp;
    }

    private int getLength(ListNode a) {
        int count = 0;
        ListNode temp = a;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

}
