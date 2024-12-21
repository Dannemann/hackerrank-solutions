package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoHashMap extends AbstractSolution {

    List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> stringMap = new HashMap<>((int) (stringList.size() / .75 + 1));

        for (String s : stringList) {
            Integer counter = stringMap.get(s);
            stringMap.put(s, counter == null ? 1 : ++counter);
        }

        List<Integer> r = new ArrayList<>(queries.size());

        for (String q : queries) {
            Integer counter = stringMap.get(q);
            r.add(counter == null ? 0 : counter);
        }

        return r;
    }

}
