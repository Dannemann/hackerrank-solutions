package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsFrequency extends AbstractSolution {

    List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        return queries.stream().map(q -> Collections.frequency(stringList, q)).collect(Collectors.toList());
    }

}
