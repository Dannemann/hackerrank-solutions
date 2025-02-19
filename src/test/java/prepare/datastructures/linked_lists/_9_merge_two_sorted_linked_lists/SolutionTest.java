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

            SinglyLinkedList llist1c = new SinglyLinkedList();
            integerList(1, 2, 3, 4).forEach(llist1c::insertNode);
            SinglyLinkedList llist2c = new SinglyLinkedList();
            integerList(1, 2, 3, 4).forEach(llist2c::insertNode);
            assertEquals(integerList(1, 1, 2, 2, 3, 3, 4, 4), sll2l(s.mergeLists(llist1c.head, llist2c.head)));

            SinglyLinkedList llist3c = new SinglyLinkedList();
            integerList(0, 2, 4, 6).forEach(llist3c::insertNode);
            SinglyLinkedList llist4c = new SinglyLinkedList();
            integerList(1, 3, 5, 7).forEach(llist4c::insertNode);
            assertEquals(integerList(0, 1, 2, 3, 4, 5, 6, 7), sll2l(s.mergeLists(llist3c.head, llist4c.head)));

            SinglyLinkedList llist5c = new SinglyLinkedList();
            integerList(1, 3, 5, 7).forEach(llist5c::insertNode);
            SinglyLinkedList llist6c = new SinglyLinkedList();
            integerList(0, 2, 4, 6).forEach(llist6c::insertNode);
            assertEquals(integerList(0, 1, 2, 3, 4, 5, 6, 7), sll2l(s.mergeLists(llist5c.head, llist6c.head)));

            SinglyLinkedList llist7c = new SinglyLinkedList();
            integerList(0).forEach(llist7c::insertNode);
            SinglyLinkedList llist8c = new SinglyLinkedList();
            integerList(1).forEach(llist8c::insertNode);
            assertEquals(integerList(0, 1), sll2l(s.mergeLists(llist7c.head, llist8c.head)));

            SinglyLinkedList llist9c = new SinglyLinkedList();
            integerList(1).forEach(llist9c::insertNode);
            SinglyLinkedList llist10c = new SinglyLinkedList();
            integerList(0).forEach(llist10c::insertNode);
            assertEquals(integerList(0, 1), sll2l(s.mergeLists(llist9c.head, llist10c.head)));

            SinglyLinkedList llist11c = new SinglyLinkedList();
            integerList(0).forEach(llist11c::insertNode);
            SinglyLinkedList llist12c = new SinglyLinkedList();
            integerList(0).forEach(llist12c::insertNode);
            assertEquals(integerList(0, 0), sll2l(s.mergeLists(llist11c.head, llist12c.head)));

            SinglyLinkedList llist13c = new SinglyLinkedList();
            integerList(0, 0, 0).forEach(llist13c::insertNode);
            SinglyLinkedList llist14c = new SinglyLinkedList();
            integerList(0, 0, 0).forEach(llist14c::insertNode);
            assertEquals(integerList(0, 0, 0, 0, 0, 0), sll2l(s.mergeLists(llist13c.head, llist14c.head)));

            SinglyLinkedList llist15c = new SinglyLinkedList();
            integerList(223, 554, 765, 4445, 12345).forEach(llist15c::insertNode);
            SinglyLinkedList llist16c = new SinglyLinkedList();
            integerList(0, 0, 0).forEach(llist16c::insertNode);
            assertEquals(integerList(0, 0, 0, 223, 554, 765, 4445, 12345), sll2l(s.mergeLists(llist15c.head, llist16c.head)));

            SinglyLinkedList llist17c = new SinglyLinkedList();
            integerList(223, 554, 765, 4445, 12345).forEach(llist17c::insertNode);
            SinglyLinkedList llist18c = new SinglyLinkedList();
            integerList(1, 222, 224, 444, 888).forEach(llist18c::insertNode);
            assertEquals(integerList(1, 222, 223, 224, 444, 554, 765, 888, 4445, 12345), sll2l(s.mergeLists(llist17c.head, llist18c.head)));




            // Test Case 1
            SinglyLinkedList llist19c = new SinglyLinkedList();
            integerList(3, 15, 48, 60, 85).forEach(llist19c::insertNode);
            SinglyLinkedList llist20c = new SinglyLinkedList();
            integerList(4, 17, 49, 90, 99).forEach(llist20c::insertNode);
            assertEquals(integerList(3, 4, 15, 17, 48, 49, 60, 85, 90, 99), sll2l(s.mergeLists(llist19c.head, llist20c.head)));

// Test Case 2
            SinglyLinkedList llist21c = new SinglyLinkedList();
            integerList(10, 20, 35, 47, 150).forEach(llist21c::insertNode);
            SinglyLinkedList llist22c = new SinglyLinkedList();
            integerList(5, 22, 38, 100, 199).forEach(llist22c::insertNode);
            assertEquals(integerList(5, 10, 20, 22, 35, 38, 47, 100, 150, 199), sll2l(s.mergeLists(llist21c.head, llist22c.head)));

// Test Case 3
            SinglyLinkedList llist23c = new SinglyLinkedList();
            integerList(1, 2, 3, 5, 10).forEach(llist23c::insertNode);
            SinglyLinkedList llist24c = new SinglyLinkedList();
            integerList(4, 6, 7, 8, 12).forEach(llist24c::insertNode);
            assertEquals(integerList(1, 2, 3, 4, 5, 6, 7, 8, 10, 12), sll2l(s.mergeLists(llist23c.head, llist24c.head)));

// Test Case 4
            SinglyLinkedList llist25c = new SinglyLinkedList();
            integerList(100, 101, 200, 202, 250).forEach(llist25c::insertNode);
            SinglyLinkedList llist26c = new SinglyLinkedList();
            integerList(99, 150, 151, 201, 300).forEach(llist26c::insertNode);
            assertEquals(integerList(99, 100, 101, 150, 151, 200, 201, 202, 250, 300), sll2l(s.mergeLists(llist25c.head, llist26c.head)));

// Test Case 5
            SinglyLinkedList llist27c = new SinglyLinkedList();
            integerList(11, 12, 13, 14, 15).forEach(llist27c::insertNode);
            SinglyLinkedList llist28c = new SinglyLinkedList();
            integerList(9, 10, 16, 17, 18).forEach(llist28c::insertNode);
            assertEquals(integerList(9, 10, 11, 12, 13, 14, 15, 16, 17, 18), sll2l(s.mergeLists(llist27c.head, llist28c.head)));

// Test Case 6
            SinglyLinkedList llist29c = new SinglyLinkedList();
            integerList(222, 333, 444, 555, 666).forEach(llist29c::insertNode);
            SinglyLinkedList llist30c = new SinglyLinkedList();
            integerList(111, 223, 224, 333, 667).forEach(llist30c::insertNode);
            assertEquals(integerList(111, 222, 223, 224, 333, 333, 444, 555, 666, 667), sll2l(s.mergeLists(llist29c.head, llist30c.head)));

// Test Case 7
            SinglyLinkedList llist31c = new SinglyLinkedList();
            integerList(2, 10, 100, 1000, 2000).forEach(llist31c::insertNode);
            SinglyLinkedList llist32c = new SinglyLinkedList();
            integerList(1, 3, 11, 111, 1999).forEach(llist32c::insertNode);
            assertEquals(integerList(1, 2, 3, 10, 11, 100, 111, 1000, 1999, 2000), sll2l(s.mergeLists(llist31c.head, llist32c.head)));

// Test Case 8
            SinglyLinkedList llist33c = new SinglyLinkedList();
            integerList(5, 9, 10, 500, 999).forEach(llist33c::insertNode);
            SinglyLinkedList llist34c = new SinglyLinkedList();
            integerList(1, 2, 3, 4, 1000).forEach(llist34c::insertNode);
            assertEquals(integerList(1, 2, 3, 4, 5, 9, 10, 500, 999, 1000), sll2l(s.mergeLists(llist33c.head, llist34c.head)));

// Test Case 9
            SinglyLinkedList llist35c = new SinglyLinkedList();
            integerList(10, 11, 12, 13, 14).forEach(llist35c::insertNode);
            SinglyLinkedList llist36c = new SinglyLinkedList();
            integerList(15, 16, 17, 18, 19).forEach(llist36c::insertNode);
            assertEquals(integerList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19), sll2l(s.mergeLists(llist35c.head, llist36c.head)));

// Test Case 10
            SinglyLinkedList llist37c = new SinglyLinkedList();
            integerList(1, 50, 99, 150, 200).forEach(llist37c::insertNode);
            SinglyLinkedList llist38c = new SinglyLinkedList();
            integerList(2, 49, 51, 198, 201).forEach(llist38c::insertNode);
            assertEquals(integerList(1, 2, 49, 50, 51, 99, 150, 198, 200, 201), sll2l(s.mergeLists(llist37c.head, llist38c.head)));

// Test Case 11
            SinglyLinkedList llist39c = new SinglyLinkedList();
            integerList(5, 500, 501, 600, 700).forEach(llist39c::insertNode);
            SinglyLinkedList llist40c = new SinglyLinkedList();
            integerList(1, 2, 501, 999, 1001).forEach(llist40c::insertNode);
            assertEquals(integerList(1, 2, 5, 500, 501, 501, 600, 700, 999, 1001), sll2l(s.mergeLists(llist39c.head, llist40c.head)));

// Test Case 12
            SinglyLinkedList llist41c = new SinglyLinkedList();
            integerList(10, 20, 30, 40, 50).forEach(llist41c::insertNode);
            SinglyLinkedList llist42c = new SinglyLinkedList();
            integerList(11, 21, 31, 41, 51).forEach(llist42c::insertNode);
            assertEquals(integerList(10, 11, 20, 21, 30, 31, 40, 41, 50, 51), sll2l(s.mergeLists(llist41c.head, llist42c.head)));

// Test Case 13
            SinglyLinkedList llist43c = new SinglyLinkedList();
            integerList(2, 6, 7, 8, 9).forEach(llist43c::insertNode);
            SinglyLinkedList llist44c = new SinglyLinkedList();
            integerList(1, 3, 4, 5, 10).forEach(llist44c::insertNode);
            assertEquals(integerList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), sll2l(s.mergeLists(llist43c.head, llist44c.head)));

// Test Case 14
            SinglyLinkedList llist45c = new SinglyLinkedList();
            integerList(101, 103, 105, 107, 109).forEach(llist45c::insertNode);
            SinglyLinkedList llist46c = new SinglyLinkedList();
            integerList(100, 102, 106, 108, 110).forEach(llist46c::insertNode);
            assertEquals(integerList(100, 101, 102, 103, 105, 106, 107, 108, 109, 110), sll2l(s.mergeLists(llist45c.head, llist46c.head)));

// Test Case 15
            SinglyLinkedList llist47c = new SinglyLinkedList();
            integerList(20, 21, 22, 23, 24).forEach(llist47c::insertNode);
            SinglyLinkedList llist48c = new SinglyLinkedList();
            integerList(25, 26, 27, 28, 29).forEach(llist48c::insertNode);
            assertEquals(integerList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29), sll2l(s.mergeLists(llist47c.head, llist48c.head)));

// Test Case 16
            SinglyLinkedList llist49c = new SinglyLinkedList();
            integerList(1, 2, 3, 100, 200).forEach(llist49c::insertNode);
            SinglyLinkedList llist50c = new SinglyLinkedList();
            integerList(50, 60, 70, 300, 400).forEach(llist50c::insertNode);
            assertEquals(integerList(1, 2, 3, 50, 60, 70, 100, 200, 300, 400), sll2l(s.mergeLists(llist49c.head, llist50c.head)));

// Test Case 17
            SinglyLinkedList llist51c = new SinglyLinkedList();
            integerList(500, 501, 502, 503, 504).forEach(llist51c::insertNode);
            SinglyLinkedList llist52c = new SinglyLinkedList();
            integerList(400, 405, 410, 415, 420).forEach(llist52c::insertNode);
            assertEquals(integerList(400, 405, 410, 415, 420, 500, 501, 502, 503, 504), sll2l(s.mergeLists(llist51c.head, llist52c.head)));

// Test Case 18
            SinglyLinkedList llist53c = new SinglyLinkedList();
            integerList(1001, 1002, 1003, 1004, 1005).forEach(llist53c::insertNode);
            SinglyLinkedList llist54c = new SinglyLinkedList();
            integerList(999, 1000, 1006, 1007, 1008).forEach(llist54c::insertNode);
            assertEquals(integerList(999, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008), sll2l(s.mergeLists(llist53c.head, llist54c.head)));

// Test Case 19
            SinglyLinkedList llist55c = new SinglyLinkedList();
            integerList(10, 30, 50, 70, 90).forEach(llist55c::insertNode);
            SinglyLinkedList llist56c = new SinglyLinkedList();
            integerList(20, 40, 60, 80, 100).forEach(llist56c::insertNode);
            assertEquals(integerList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100), sll2l(s.mergeLists(llist55c.head, llist56c.head)));

// Test Case 20
            SinglyLinkedList llist57c = new SinglyLinkedList();
            integerList(33, 66, 99, 132, 165).forEach(llist57c::insertNode);
            SinglyLinkedList llist58c = new SinglyLinkedList();
            integerList(44, 55, 88, 110, 220).forEach(llist58c::insertNode);
            assertEquals(integerList(33, 44, 55, 66, 88, 99, 110, 132, 165, 220), sll2l(s.mergeLists(llist57c.head, llist58c.head)));

// Test Case 21
            SinglyLinkedList llist59c = new SinglyLinkedList();
            integerList(2, 4, 6, 8, 10).forEach(llist59c::insertNode);
            SinglyLinkedList llist60c = new SinglyLinkedList();
            integerList(1, 3, 5, 7, 9).forEach(llist60c::insertNode);
            assertEquals(integerList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), sll2l(s.mergeLists(llist59c.head, llist60c.head)));

// Test Case 22
            SinglyLinkedList llist61c = new SinglyLinkedList();
            integerList(15, 150, 225, 300, 450).forEach(llist61c::insertNode);
            SinglyLinkedList llist62c = new SinglyLinkedList();
            integerList(14, 149, 226, 299, 451).forEach(llist62c::insertNode);
            assertEquals(integerList(14, 15, 149, 150, 225, 226, 299, 300, 450, 451), sll2l(s.mergeLists(llist61c.head, llist62c.head)));

// Test Case 23
            SinglyLinkedList llist63c = new SinglyLinkedList();
            integerList(60, 120, 180, 240, 300).forEach(llist63c::insertNode);
            SinglyLinkedList llist64c = new SinglyLinkedList();
            integerList(30, 90, 150, 210, 270).forEach(llist64c::insertNode);
            assertEquals(integerList(30, 60, 90, 120, 150, 180, 210, 240, 270, 300), sll2l(s.mergeLists(llist63c.head, llist64c.head)));

// Test Case 24
            SinglyLinkedList llist65c = new SinglyLinkedList();
            integerList(7, 14, 21, 28, 35).forEach(llist65c::insertNode);
            SinglyLinkedList llist66c = new SinglyLinkedList();
            integerList(6, 13, 20, 27, 36).forEach(llist66c::insertNode);
            assertEquals(integerList(6, 7, 13, 14, 20, 21, 27, 28, 35, 36), sll2l(s.mergeLists(llist65c.head, llist66c.head)));

// Test Case 25
            SinglyLinkedList llist67c = new SinglyLinkedList();
            integerList(70, 80, 90, 100, 110).forEach(llist67c::insertNode);
            SinglyLinkedList llist68c = new SinglyLinkedList();
            integerList(60, 75, 85, 95, 105).forEach(llist68c::insertNode);
            assertEquals(integerList(60, 70, 75, 80, 85, 90, 95, 100, 105, 110), sll2l(s.mergeLists(llist67c.head, llist68c.head)));

// Test Case 26
            SinglyLinkedList llist69c = new SinglyLinkedList();
            integerList(1, 100, 101, 102, 103).forEach(llist69c::insertNode);
            SinglyLinkedList llist70c = new SinglyLinkedList();
            integerList(50, 99, 104, 105, 200).forEach(llist70c::insertNode);
            assertEquals(integerList(1, 50, 99, 100, 101, 102, 103, 104, 105, 200), sll2l(s.mergeLists(llist69c.head, llist70c.head)));

// Test Case 27
            SinglyLinkedList llist71c = new SinglyLinkedList();
            integerList(300, 305, 310, 315, 320).forEach(llist71c::insertNode);
            SinglyLinkedList llist72c = new SinglyLinkedList();
            integerList(299, 304, 309, 314, 321).forEach(llist72c::insertNode);
            assertEquals(integerList(299, 300, 304, 305, 309, 310, 314, 315, 320, 321), sll2l(s.mergeLists(llist71c.head, llist72c.head)));

// Test Case 28
            SinglyLinkedList llist73c = new SinglyLinkedList();
            integerList(9999, 10000, 10001, 10002, 10003).forEach(llist73c::insertNode);
            SinglyLinkedList llist74c = new SinglyLinkedList();
            integerList(9998, 9999, 10001, 10002, 10004).forEach(llist74c::insertNode);
            assertEquals(integerList(9998, 9999, 9999, 10000, 10001, 10001, 10002, 10002, 10003, 10004), sll2l(s.mergeLists(llist73c.head, llist74c.head)));

// Test Case 29
            SinglyLinkedList llist75c = new SinglyLinkedList();
            integerList(400, 600, 800, 1000, 1200).forEach(llist75c::insertNode);
            SinglyLinkedList llist76c = new SinglyLinkedList();
            integerList(300, 450, 650, 900, 1100).forEach(llist76c::insertNode);
            assertEquals(integerList(300, 400, 450, 600, 650, 800, 900, 1000, 1100, 1200), sll2l(s.mergeLists(llist75c.head, llist76c.head)));

// Test Case 30
            SinglyLinkedList llist77c = new SinglyLinkedList();
            integerList(10, 100, 200, 201, 202).forEach(llist77c::insertNode);
            SinglyLinkedList llist78c = new SinglyLinkedList();
            integerList(9, 99, 199, 203, 204).forEach(llist78c::insertNode);
            assertEquals(integerList(9, 10, 99, 100, 199, 200, 201, 202, 203, 204), sll2l(s.mergeLists(llist77c.head, llist78c.head)));

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
