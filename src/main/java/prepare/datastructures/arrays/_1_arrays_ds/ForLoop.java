package prepare.datastructures.arrays._1_arrays_ds;

import java.util.ArrayList;
import java.util.List;

class ForLoop extends AbstractSolution {

    List<Integer> reverseArray(List<Integer> a) {
        int size = a.size();
        List<Integer> r = new ArrayList<>(size);

        for (int i = size - 1; i >= 0; i--)
            r.add(a.get(i));

        return r;
    }

}
