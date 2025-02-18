package prepare.datastructures.linked_lists._7_reverse_a_linked_list;

import prepare.datastructures.linked_lists.SinglyLinkedListNode;

class Recursive extends AbstractSolution {

    SinglyLinkedListNode newHead;

    SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        recursiveReverse(llist);
        return newHead;
    }

    void recursiveReverse(SinglyLinkedListNode llist) {
        if (llist.next == null) {
            newHead = llist;
            return;
        }

        recursiveReverse(llist.next);

        llist.next.next = llist;
        llist.next = null;
    }

}
