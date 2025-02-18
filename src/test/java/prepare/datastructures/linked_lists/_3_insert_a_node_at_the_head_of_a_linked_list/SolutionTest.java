package prepare.datastructures.linked_lists._3_insert_a_node_at_the_head_of_a_linked_list;

import org.junit.Test;
import prepare.datastructures.linked_lists._0_Resources.SinglyLinkedList;
import prepare.datastructures.linked_lists._0_Resources.SinglyLinkedListNode;

import java.util.ArrayList;
import java.util.Collections;
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
            List<Integer> input0 = integerList(383, 484, 392, 975, 321);
            input0.forEach(llistItem -> llist0.head = s.insertNodeAtHead(llist0.head, llistItem));
            Collections.reverse(input0);
            assertEquals(input0, sll2l(llist0));

            SinglyLinkedList llist1 = new SinglyLinkedList();
            List<Integer> input1 = integerList(321, 641, 653, 524, 952, 337, 955, 891, 590, 133);
            input1.forEach(llistItem -> llist1.head = s.insertNodeAtHead(llist1.head, llistItem));
            Collections.reverse(input1);
            assertEquals(input1, sll2l(llist1));
        }
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
