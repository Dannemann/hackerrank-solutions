package prepare.datastructures.linked_lists._5_delete_a_node;

class Solution extends AbstractSolution {

    SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if (position == 0)
            return llist.next;

        SinglyLinkedListNode head = llist;

        int targetIdx = position - 1;
        for (int i = 0; i < targetIdx; i++)
            llist = llist.next;

        llist.next = llist.next.next;

        return head;
    }

}
