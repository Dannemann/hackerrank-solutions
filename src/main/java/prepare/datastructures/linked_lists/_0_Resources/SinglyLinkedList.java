package prepare.datastructures.linked_lists._0_Resources;

/**
 * Code provided by HackerRank.
 */
public class SinglyLinkedList {

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
