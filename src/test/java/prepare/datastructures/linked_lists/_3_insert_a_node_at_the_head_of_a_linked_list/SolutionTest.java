package prepare.datastructures.linked_lists._3_insert_a_node_at_the_head_of_a_linked_list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new Solution()
        );

        for (AbstractSolution s : solutions) {
            SinglyLinkedList llist1 = new SinglyLinkedList();
            List<Integer> input0 = input0();
            input0.forEach(llistItem -> llist1.head = s.insertNodeAtHead(llist1.head, llistItem));
            Collections.reverse(input0);
            assertEquals(input0, sll2l(llist1));

            SinglyLinkedList llist2 = new SinglyLinkedList();
            List<Integer> input1 = input1();
            input1.forEach(llistItem -> llist2.head = s.insertNodeAtHead(llist2.head, llistItem));
            Collections.reverse(input1);
            assertEquals(input1, sll2l(llist2));
        }
    }

    List<Integer> input0() {
        List<Integer> r = new ArrayList<>();
        r.add(383);
        r.add(484);
        r.add(392);
        r.add(975);
        r.add(321);
        return r;
    }

    List<Integer> input1() {
        List<Integer> r = new ArrayList<>();
        r.add(321);
        r.add(641);
        r.add(653);
        r.add(524);
        r.add(952);
        r.add(337);
        r.add(955);
        r.add(891);
        r.add(590);
        r.add(133);
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
