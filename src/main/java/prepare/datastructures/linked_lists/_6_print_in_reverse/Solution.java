package prepare.datastructures.linked_lists._6_print_in_reverse;

import prepare.datastructures.linked_lists._0_Resources.SinglyLinkedListNode;

class Solution extends AbstractSolution {

    String reversePrint(SinglyLinkedListNode llist) {
        return llist.next != null ? reversePrint(llist.next) + llist.data : Integer.toString(llist.data);
    }

}
