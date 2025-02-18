package prepare.datastructures.linked_lists._7_reverse_a_linked_list;

import prepare.datastructures.linked_lists._0_Resources.SinglyLinkedListNode;

class Solution extends AbstractSolution {

    SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode[] arr = new SinglyLinkedListNode[1000];
        int i = 999;

        while (llist != null) {
            arr[i--] = llist;
            llist = llist.next;
        }

        for (int j = i + 1; j < 999; j++)
            arr[j].next = arr[j + 1];

        arr[999].next = null;

        return arr[i + 1];
    }

}
