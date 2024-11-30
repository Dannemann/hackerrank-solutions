package prepare.datastructures.arrays._1_arrays_ds;

import java.util.Collections;
import java.util.List;

class Fav_OneForLoopOnly extends AbstractSolution {

    List<Integer> reverseArray(List<Integer> a) {
        for (int i = 0, d = a.size() - 1; i < d; i++, d--)
            Collections.swap(a, i, d);

        return a;
    }

}
