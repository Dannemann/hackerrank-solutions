package prepare.datastructures.linked_lists._4_Insert_a_node_at_a_specific_position_in_a_linked_list;

import org.junit.Test;
import prepare.datastructures.linked_lists.SinglyLinkedList;
import prepare.datastructures.linked_lists.SinglyLinkedListNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.ListUtils.integerList;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new Solution()
        );

        for (AbstractSolution s : solutions) {
            SinglyLinkedList llist0 = new SinglyLinkedList();
            integerList(16, 13, 7).forEach(llist0::insertNode);
            s.insertNodeAtPosition(llist0.head, 1, 2);
            assertEquals(List.of(16, 13, 1, 7), sll2l(llist0));

            SinglyLinkedList llist1 = new SinglyLinkedList();
            integerList(11, 9, 19, 10, 4).forEach(llist1::insertNode);
            s.insertNodeAtPosition(llist1.head, 20, 3);
            assertEquals(List.of(11, 9, 19, 20, 10, 4), sll2l(llist1));

            SinglyLinkedList llist9 = new SinglyLinkedList();
            integerList(1, 2, 3, 4, 5, 6).forEach(llist9::insertNode);
            s.insertNodeAtPosition(llist9.head, 7, 5);
            assertEquals(List.of(1, 2, 3, 4, 5, 7, 6), sll2l(llist9));
        }
    }

    List<Integer> sll2l(SinglyLinkedList llist) {
        List<Integer> r = new ArrayList<>();
        SinglyLinkedListNode node = llist.head;
        while (node != null) {
            r.add(node.data);
            node = node.next;
        }
        return r;
    }

}
