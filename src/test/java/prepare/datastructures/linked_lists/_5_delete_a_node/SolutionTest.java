package prepare.datastructures.linked_lists._5_delete_a_node;

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
            integerList(20, 6, 2, 19, 7, 4, 15, 9).forEach(llist0::insertNode);
            assertEquals(List.of(20, 6, 2, 7, 4, 15, 9), sll2l(s.deleteNode(llist0.head, 3)));

            SinglyLinkedList llist1 = new SinglyLinkedList();
            integerList(11, 9, 2, 9).forEach(llist1::insertNode);
            assertEquals(List.of(11, 2, 9), sll2l(s.deleteNode(llist1.head, 1)));

            // Custom:

            SinglyLinkedList llist1c = new SinglyLinkedList();
            integerList(1).forEach(llist1c::insertNode);
            assertEquals(List.of(), sll2l(s.deleteNode(llist1c.head, 0)));

            SinglyLinkedList llist2c = new SinglyLinkedList();
            integerList(1, 2).forEach(llist2c::insertNode);
            assertEquals(List.of(1), sll2l(s.deleteNode(llist2c.head, 1)));

            SinglyLinkedList llist3c = new SinglyLinkedList();
            integerList(1, 2).forEach(llist3c::insertNode);
            assertEquals(List.of(2), sll2l(s.deleteNode(llist3c.head, 0)));
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
