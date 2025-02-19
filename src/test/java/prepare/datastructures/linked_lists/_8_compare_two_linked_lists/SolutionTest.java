package prepare.datastructures.linked_lists._8_compare_two_linked_lists;

import org.junit.Test;
import prepare.datastructures.linked_lists.SinglyLinkedList;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utils.ListUtils.integerList;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new Solution()
        );

        for (AbstractSolution s : solutions) {
            SinglyLinkedList llist01 = new SinglyLinkedList();
            integerList(1, 2).forEach(llist01::insertNode);
            SinglyLinkedList llist02 = new SinglyLinkedList();
            integerList(1).forEach(llist02::insertNode);
            assertFalse(s.compareLists(llist01.head, llist02.head));

            SinglyLinkedList llist03 = new SinglyLinkedList();
            integerList(1, 2).forEach(llist03::insertNode);
            SinglyLinkedList llist04 = new SinglyLinkedList();
            integerList(1, 2).forEach(llist04::insertNode);
            assertTrue(s.compareLists(llist03.head, llist04.head));

            SinglyLinkedList llist11 = new SinglyLinkedList();
            integerList(3, 2, 2).forEach(llist11::insertNode);
            SinglyLinkedList llist12 = new SinglyLinkedList();
            integerList(3, 2, 2).forEach(llist12::insertNode);
            assertTrue(s.compareLists(llist11.head, llist12.head));

            SinglyLinkedList llist13 = new SinglyLinkedList();
            integerList(2, 1).forEach(llist13::insertNode);
            SinglyLinkedList llist14 = new SinglyLinkedList();
            integerList(1, 2).forEach(llist14::insertNode);
            assertFalse(s.compareLists(llist13.head, llist14.head));
        }
    }

}
