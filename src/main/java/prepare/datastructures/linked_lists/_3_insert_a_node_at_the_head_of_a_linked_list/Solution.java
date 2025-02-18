package prepare.datastructures.linked_lists._3_insert_a_node_at_the_head_of_a_linked_list;

import prepare.datastructures.linked_lists.SinglyLinkedListNode;

class Solution extends AbstractSolution {

    SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (llist != null)
            newNode.next = llist;

        return newNode;
    }

}
