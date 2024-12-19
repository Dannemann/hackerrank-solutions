package prepare.datastructures.arrays._4_left_rotation;

import java.util.Collections;
import java.util.List;

class CollectionsSwap extends AbstractSolution {

    List<Integer> rotateLeft(int d, List<Integer> arr) {
        int sizeMinus = arr.size() - 1;
        revertSublist(arr, 0, d - 1);
        revertSublist(arr, d, sizeMinus);
        revertSublist(arr, 0, sizeMinus);
        return arr;
    }

    void revertSublist(List<Integer> arr, int i, int j) {
        for (; i < j; Collections.swap(arr, i++, j--)) ;
    }

}
