package prepare.datastructures.linked_lists._7_reverse_a_linked_list;

import prepare.datastructures.linked_lists.SinglyLinkedListNode;

class Solution extends AbstractSolution {

    SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode prev = null;

        while (llist != null) {
            SinglyLinkedListNode next = llist.next;
            llist.next = prev;
            prev = llist;
            llist = next;
        }

        return prev;
    }

}
