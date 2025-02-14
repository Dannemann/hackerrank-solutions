package prepare.datastructures.linked_lists._1_print_the_elements_of_a_linked_list;

import java.util.ArrayList;
import java.util.List;

class Solution extends AbstractSolution {

    List<Integer> printLinkedList(SinglyLinkedListNode head) {
        List<Integer> r = new ArrayList<>();

        while (head != null) {
            r.add(head.data);

            System.out.println(head.data);
            head = head.next;
        }

        System.out.println();

        return r;
    }

}
