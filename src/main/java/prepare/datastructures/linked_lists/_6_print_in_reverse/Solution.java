package prepare.datastructures.linked_lists._6_print_in_reverse;

import prepare.datastructures.linked_lists._0_Resources.SinglyLinkedListNode;

class Solution extends AbstractSolution {

    SinglyLinkedListNode reversePrint(SinglyLinkedListNode llist) {
        SinglyLinkedListNode[] arr = new SinglyLinkedListNode[1000];
        int i = 999;

        while (llist != null) {
            arr[i--] = llist;
            llist = llist.next;
        }

        for (int j = i + 1; j < 999; j++)
            arr[j].next = arr[j + 1];

        arr[999].next = null;

        for (int j = i + 1; j < 1000; j++)
            System.out.println(arr[j].data);

        return arr[i + 1];
    }

}
