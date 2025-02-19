package prepare.datastructures.linked_lists._9_merge_two_sorted_linked_lists;

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
            SinglyLinkedList llist01 = new SinglyLinkedList();
            integerList(1, 2, 3).forEach(llist01::insertNode);
            SinglyLinkedList llist02 = new SinglyLinkedList();
            integerList(3, 4).forEach(llist02::insertNode);
            assertEquals(integerList(1, 2, 3, 3, 4), sll2l(s.mergeLists(llist01.head, llist02.head)));

            SinglyLinkedList llist03 = new SinglyLinkedList();
            integerList(4, 5, 6).forEach(llist03::insertNode);
            SinglyLinkedList llist04 = new SinglyLinkedList();
            integerList(1, 2, 10).forEach(llist04::insertNode);
            assertEquals(integerList(1, 2, 4, 5, 6, 10), sll2l(s.mergeLists(llist03.head, llist04.head)));

            // Custom:

            SinglyLinkedList llist01c = new SinglyLinkedList();
            integerList(1, 2, 3, 4).forEach(llist01c::insertNode);
            SinglyLinkedList llist02c = new SinglyLinkedList();
            integerList(1, 2, 3, 4).forEach(llist02c::insertNode);
            assertEquals(integerList(1, 1, 2, 2, 3, 3, 4, 4), sll2l(s.mergeLists(llist01c.head, llist02c.head)));
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
