package prepare.datastructures.linked_lists._2_insert_a_node_at_the_tail_of_a_linked_list;

import org.junit.Test;

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
            List<Integer> input0 = integerList(141, 302, 164, 530, 474);
            input0.forEach(llistItem -> llist0.head = s.insertNodeAtTail(llist0.head, llistItem));
            assertEquals(input0, sll2l(llist0));

            SinglyLinkedList llist1 = new SinglyLinkedList();
            List<Integer> input1 = integerList(236, 326, 937);
            input1.forEach(llistItem -> llist1.head = s.insertNodeAtTail(llist1.head, llistItem));
            assertEquals(input1, sll2l(llist1));
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
