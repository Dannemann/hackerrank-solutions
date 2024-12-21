package prepare.datastructures.arrays._1_arrays_ds;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class IntStreamRange extends AbstractSolution {

    List<Integer> reverseArray(List<Integer> a) {
        int size = a.size();
        return IntStream.range(0, size).map(i -> a.get(size - i - 1)).boxed().collect(Collectors.toUnmodifiableList());
    }

}
