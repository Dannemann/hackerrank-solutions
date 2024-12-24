package prepare.datastructures.linked_lists._1_print_the_elements_of_a_linked_list;

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
