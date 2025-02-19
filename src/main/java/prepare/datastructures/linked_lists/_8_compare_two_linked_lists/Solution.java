package prepare.datastructures.linked_lists._8_compare_two_linked_lists;

import prepare.datastructures.linked_lists.SinglyLinkedListNode;

class Solution extends AbstractSolution {

    boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null) {
            if (head2 == null || head1.data != head2.data)
                return false;

            head1 = head1.next;
            head2 = head2.next;
        }

        return head2 == null;
    }

}
