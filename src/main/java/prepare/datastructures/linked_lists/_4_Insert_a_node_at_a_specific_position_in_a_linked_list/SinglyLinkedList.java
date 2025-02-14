package prepare.datastructures.linked_lists._4_Insert_a_node_at_a_specific_position_in_a_linked_list;

class SinglyLinkedList {

    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null)
            this.head = node;
        else
            this.tail.next = node;

        this.tail = node;
    }

}
