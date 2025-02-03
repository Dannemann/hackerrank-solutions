package prepare.datastructures.arrays._4_left_rotation;

import java.util.LinkedList;
import java.util.List;

class LinkedListPop extends AbstractSolution {

    List<Integer> rotateLeft(int d, List<Integer> arr) {
        LinkedList<Integer> ll = new LinkedList<>(arr);
        arr = null;

        for (int i = 0; i < d; i++)
            ll.addLast(ll.removeFirst());

        return ll;
    }

}
