package prepare.datastructures.linked_lists._9_merge_two_sorted_linked_lists;

import prepare.datastructures.linked_lists.SinglyLinkedListNode;

class Iterative extends AbstractSolution {

    SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode e1 = head1;
        SinglyLinkedListNode e2 = head2;
        SinglyLinkedListNode next2 = null;
        SinglyLinkedListNode prev = new SinglyLinkedListNode(-1);

        while (e1 != null)
            if (e2 != null) {
                SinglyLinkedListNode next1 = e1.next;
                next2 = e2.next;

                if (e1.data <= e2.data) {
                    if (next1 != null && next1.data < e2.data) {
                        prev = e1;
                        e1 = next1;
                        continue;
                    }

                    e2.next = e1.next;
                    e1.next = e2;
                } else {
                    prev.next = e2;
                    e2.next = e1;
                }

                prev = e2;
                e2 = next2;
            } else
                break;

        if (e2 != null)
            e2.next = next2;

        return head1.data <= head2.data ? head1 : head2;
    }

}
