package prepare.datastructures.linked_lists._6_print_in_reverse;

import org.junit.Test;
import prepare.datastructures.linked_lists._0_Resources.SinglyLinkedList;

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
            assertEquals("5241216", s.reversePrint(llist00.head));
        }
    }

}
