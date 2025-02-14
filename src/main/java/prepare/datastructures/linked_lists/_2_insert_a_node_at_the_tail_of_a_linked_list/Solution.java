package prepare.datastructures.linked_lists._2_insert_a_node_at_the_tail_of_a_linked_list;

class Solution extends AbstractSolution {

    SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null)
            return new SinglyLinkedListNode(data);
        else {
            SinglyLinkedListNode second = head.next;

            if (second == null)
                head.next = new SinglyLinkedListNode(data);
            else {
                SinglyLinkedListNode last = null;

                while (second != null) {
                    last = second;
                    second = second.next;
                }

                last.next = new SinglyLinkedListNode(data);
            }

            return head;
        }
    }

}
