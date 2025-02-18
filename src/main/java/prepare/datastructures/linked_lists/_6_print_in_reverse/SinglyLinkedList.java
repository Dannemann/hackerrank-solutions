package prepare.datastructures.linked_lists._6_print_in_reverse;

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
