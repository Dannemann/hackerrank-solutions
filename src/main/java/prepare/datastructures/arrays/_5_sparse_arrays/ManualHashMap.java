package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.ArrayList;
import java.util.List;

public class ManualHashMap extends AbstractSolution {

    List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        int[] hashMap = new int[1000];
        List<Integer> r = new ArrayList<>(1000);

        stringList.forEach(s -> hashMap[s.hashCode() % 1000]++);
        queries.forEach(s -> r.add(hashMap[s.hashCode() % 1000]));

        return r;
    }

}
