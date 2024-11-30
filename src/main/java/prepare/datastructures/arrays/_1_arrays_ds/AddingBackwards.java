package prepare.datastructures.arrays._1_arrays_ds;

import java.util.Arrays;
import java.util.List;

class AddingBackwards extends AbstractSolution {

    List<Integer> reverseArray(List<Integer> a) {
        int size = a.size();
        Integer[] r = new Integer[size];

        for (Integer i : a)
            r[--size] = i;

        return Arrays.asList(r);
    }

}
