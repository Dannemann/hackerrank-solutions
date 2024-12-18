package prepare.datastructures.arrays._4_left_rotation;

import java.util.ArrayList;
import java.util.List;

class TwoForLoops extends AbstractSolution {

    List<Integer> rotateLeft(int d, List<Integer> arr) {
        int size = arr.size();
        List<Integer> r = new ArrayList<>(size);

        for (int i = d; i < size; r.add(arr.get(i++))) ;
        for (int i = 0; i < d; r.add(arr.get(i++))) ;

        return r;
    }

}
