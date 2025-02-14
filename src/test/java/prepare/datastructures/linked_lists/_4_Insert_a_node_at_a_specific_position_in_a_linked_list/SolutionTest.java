package prepare.datastructures.linked_lists._4_Insert_a_node_at_a_specific_position_in_a_linked_list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new Solution()
        );

        for (AbstractSolution s : solutions) {
            SinglyLinkedList llist0 = new SinglyLinkedList();
            input0().forEach(llist0::insertNode);
            s.insertNodeAtPosition(llist0.head, 1, 2);
            assertEquals(List.of(16, 13, 1, 7), sll2l(llist0));

            SinglyLinkedList llist1 = new SinglyLinkedList();
            input1().forEach(llist1::insertNode);
            s.insertNodeAtPosition(llist1.head, 20, 3);
            assertEquals(List.of(11, 9, 19, 20, 10, 4), sll2l(llist1));

            SinglyLinkedList llist9 = new SinglyLinkedList();
            input9().forEach(llist9::insertNode);
            s.insertNodeAtPosition(llist9.head, 7, 5);
            assertEquals(List.of(1, 2, 3, 4, 5, 7, 6), sll2l(llist9));
        }
    }

    List<Integer> input0() {
        List<Integer> r = new ArrayList<>();
        r.add(16);
        r.add(13);
        r.add(7);
        return r;
    }

    List<Integer> input1() {
        List<Integer> r = new ArrayList<>();
        r.add(11);
        r.add(9);
        r.add(19);
        r.add(10);
        r.add(4);
        return r;
    }

    List<Integer> input9() {
        List<Integer> r = new ArrayList<>();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);
        r.add(6);
        return r;
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
