package prepare.datastructures.linked_lists._1_print_the_elements_of_a_linked_list;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new Solution()
        );

        for (AbstractSolution s : solutions) {
            assertEquals(List.of(16, 13), s.printLinkedList(singlyll(16, 13).head));
            assertEquals(List.of(17, 19, 5, 12), s.printLinkedList(singlyll(17, 19, 5, 12).head));
        }
    }

    SinglyLinkedList singlyll(Integer... ints) {
        SinglyLinkedList llist = new SinglyLinkedList();
        Stream.of(ints).forEach(llist::insertNode);
        return llist;
    }

}
