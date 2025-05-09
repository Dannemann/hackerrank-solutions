package prepare.datastructures.linked_lists._2_insert_a_node_at_the_tail_of_a_linked_list;

import prepare.datastructures.linked_lists.SinglyLinkedListNode;

class Solution extends AbstractSolution {

    SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null)
            return new SinglyLinkedListNode(data);

        SinglyLinkedListNode current = head.next;
        SinglyLinkedListNode last = head;

        while (current != null) {
            last = current;
            current = current.next;
        }

        last.next = new SinglyLinkedListNode(data);

        return head;
    }

}
