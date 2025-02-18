package prepare.datastructures.linked_lists._6_print_in_reverse;

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
            SinglyLinkedList llist00 = new SinglyLinkedList();
            integerList(16, 12, 4, 2, 5).forEach(llist00::insertNode);
            assertEquals(List.of(5, 2, 4, 12, 16), sll2l(s.reversePrint(llist00.head)));
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
