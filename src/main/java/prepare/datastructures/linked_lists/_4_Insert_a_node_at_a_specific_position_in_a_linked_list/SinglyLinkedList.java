package prepare.datastructures.linked_lists._4_Insert_a_node_at_a_specific_position_in_a_linked_list;

/**
 * Code provided by HackerRank.
 */
class SinglyLinkedList {

    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (head == null)
            head = node;
        else
            tail.next = node;

        tail = node;
    }

}
