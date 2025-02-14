package prepare.datastructures.linked_lists._2_insert_a_node_at_the_tail_of_a_linked_list;

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
            SinglyLinkedList llist;

            llist = new SinglyLinkedList();
            for (int i : input0())
                llist.head = s.insertNodeAtTail(llist.head, i);
            assertEquals(input0(), sll2l(llist));

            llist = new SinglyLinkedList();
            for (int i : input1())
                llist.head = s.insertNodeAtTail(llist.head, i);
            assertEquals(input1(), sll2l(llist));
        }
    }

    List<Integer> input0() {
        List<Integer> r = new ArrayList<>();
        r.add(141);
        r.add(302);
        r.add(164);
        r.add(530);
        r.add(474);
        return r;
    }

    List<Integer> input1() {
        List<Integer> r = new ArrayList<>();
        r.add(236);
        r.add(326);
        r.add(937);
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
