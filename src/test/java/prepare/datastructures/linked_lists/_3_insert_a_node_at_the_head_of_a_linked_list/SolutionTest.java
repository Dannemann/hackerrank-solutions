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
            SinglyLinkedList llist;
            List<Integer> input;

            llist = new SinglyLinkedList();
            input = input0();
            for (int llistItem : input)
                llist.head = s.insertNodeAtHead(llist.head, llistItem);
            Collections.reverse(input);
            assertEquals(input, sll2l(llist));

            llist = new SinglyLinkedList();
            input = input1();
            for (int llistItem : input)
                llist.head = s.insertNodeAtHead(llist.head, llistItem);
            Collections.reverse(input);
            assertEquals(input, sll2l(llist));
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
