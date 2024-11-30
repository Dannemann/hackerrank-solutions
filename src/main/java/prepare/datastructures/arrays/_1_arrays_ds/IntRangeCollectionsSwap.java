package prepare.datastructures.arrays._1_arrays_ds;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class IntRangeCollectionsSwap extends AbstractSolution {

    List<Integer> reverseArray(List<Integer> a) {
        int size = a.size();
        IntStream.range(0, size / 2).forEach(i -> Collections.swap(a, i, size - i - 1));
        return a;
    }

}
