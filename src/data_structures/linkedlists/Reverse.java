package data_structures.linkedlists;


public class Reverse {

    public static ListNode reverse(ListNode root){
        if(root == null || root.next == null){
            return root;
        }

        ListNode p1 = root;
        ListNode p2 = root.next;

        p1.next = null;

        while(p2 != null){
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }

        return p1;
    }

}
