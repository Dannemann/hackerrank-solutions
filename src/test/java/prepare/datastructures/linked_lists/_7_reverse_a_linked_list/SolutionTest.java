package prepare.datastructures.linked_lists._7_reverse_a_linked_list;

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
                new Iterative(),
                new Recursive()
        );

        for (AbstractSolution s : solutions) {
            SinglyLinkedList llist01 = new SinglyLinkedList();
            integerList(1, 2, 3, 4, 5).forEach(llist01::insertNode);
            assertEquals(List.of(5, 4, 3, 2, 1), sll2l(s.reverse(llist01.head)));
        }
    }

    List<Integer> sll2l(SinglyLinkedListNode node) {
        List<Integer> r = new ArrayList<>();
        while (node != null) {
            r.add(node.data);
            node = node.next;
        }
        return r;
    }

}
