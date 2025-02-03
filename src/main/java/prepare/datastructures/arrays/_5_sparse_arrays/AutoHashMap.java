package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AutoHashMap extends AbstractSolution {

    List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> stringMap = new HashMap<>((int) (stringList.size() / .75 + 1));

        for (String s : stringList) {
            Integer counter = stringMap.get(s);
            stringMap.put(s, counter == null ? 1 : ++counter);
        }

        stringList = null;

        return queries.stream().map(q -> {
            Integer counter = stringMap.get(q);
            return counter == null ? 0 : counter;
        }).collect(Collectors.toUnmodifiableList());
    }

}
