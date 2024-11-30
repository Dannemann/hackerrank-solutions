package prepare.datastructures.arrays._1_arrays_ds;

import java.util.Collections;
import java.util.List;

class WhileSwap extends AbstractSolution {

    List<Integer> reverseArray(List<Integer> a) {
        int i = 0;
        int d = a.size() - 1;

        while (i < d)
            Collections.swap(a, i++, d--);

        return a;
    }

}
