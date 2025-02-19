package prepare.datastructures.linked_lists._8_compare_two_linked_lists;

import prepare.datastructures.linked_lists.SinglyLinkedListNode;

class Recursive extends AbstractSolution {

    boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 != null && head2 != null) {
            if (head1.data != head2.data)
                return false;
        } else
            return head1 == null && head2 == null;

        return compareLists(head1.next, head2.next);
    }

}
