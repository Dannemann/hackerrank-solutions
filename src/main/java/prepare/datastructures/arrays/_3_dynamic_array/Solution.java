package prepare.datastructures.arrays._3_dynamic_array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution extends AbstractSolution {

    List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>(n);
        Integer lastAnswer = 0;
        List<Integer> r = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> arr.add(new ArrayList<>()));

        for (List<Integer> query : queries) {
            List<Integer> ar = arr.get((query.get(1) ^ lastAnswer) % n);

            if (query.get(0) == 1)
                ar.add(query.get(2));
            else
                r.add(lastAnswer = ar.get(query.get(2) % ar.size()));
        }

        return r;
    }

}
