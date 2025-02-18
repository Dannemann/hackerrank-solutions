package prepare.datastructures.linked_lists._6_print_in_reverse;

import org.junit.Test;
import prepare.datastructures.linked_lists.SinglyLinkedList;

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
            SinglyLinkedList llist01 = new SinglyLinkedList();
            integerList(16, 12, 4, 2, 5).forEach(llist01::insertNode);
            assertEquals("5241216", s.reversePrint(llist01.head));
        }
    }

}
