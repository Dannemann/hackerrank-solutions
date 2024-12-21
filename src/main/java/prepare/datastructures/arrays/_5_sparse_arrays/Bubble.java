package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Bubble extends AbstractSolution {

    List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        return queries.stream().map(q -> {
            int counter = 0;

            for (String s : stringList)
                if (s.equals(q))
                    counter++;

            return counter;
        }).collect(Collectors.toUnmodifiableList());
    }

}
