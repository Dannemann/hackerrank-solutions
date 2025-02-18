package prepare.datastructures.linked_lists._1_print_the_elements_of_a_linked_list;

import prepare.datastructures.linked_lists._0_Resources.SinglyLinkedListNode;

import java.util.ArrayList;
import java.util.List;

class Solution extends AbstractSolution {

    List<Integer> printLinkedList(SinglyLinkedListNode head) {
        List<Integer> r = new ArrayList<>();

        while (head != null) {
            System.out.println(head.data);

            r.add(head.data);
            head = head.next;
        }

        return r;
    }

}
