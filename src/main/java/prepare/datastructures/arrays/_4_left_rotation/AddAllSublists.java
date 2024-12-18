package prepare.datastructures.arrays._4_left_rotation;

import java.util.ArrayList;
import java.util.List;

class AddAllSublists extends AbstractSolution {

    List<Integer> rotateLeft(int d, List<Integer> arr) {
        int size = arr.size();
        List<Integer> r = new ArrayList<>(size);
        r.addAll(arr.subList(d, size));
        r.addAll(arr.subList(0, d));
        return r;
    }

}
