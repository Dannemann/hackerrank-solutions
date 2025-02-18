package prepare.datastructures.linked_lists._4_Insert_a_node_at_a_specific_position_in_a_linked_list;

import prepare.datastructures.linked_lists.SinglyLinkedListNode;

class Solution extends AbstractSolution {

    SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode head = llist;

        int targetIdx = position - 1;
        for (int i = 0; i < targetIdx; i++)
            llist = llist.next;

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist.next;
        llist.next = newNode;

        return head;
    }

}
