package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.ArrayList;
import java.util.List;

public class ManualHashMap extends AbstractSolution {

    List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        int capacity = (int) (stringList.size() / .75 + 1);
        String[][] stringsHashMap = new String[capacity][];
        Integer[] countersHashMap = new Integer[capacity];

        for (String s : stringList) {
            int bucketCode = Math.abs(s.hashCode() % capacity);

            if (stringsHashMap[bucketCode] == null) {
                stringsHashMap[bucketCode] = new String[50];
                countersHashMap[bucketCode] = 0;
            }

            stringsHashMap[bucketCode][countersHashMap[bucketCode]++] = s;
        }

        List<Integer> r = new ArrayList<>(queries.size());

        for (String q : queries) {
            int bucketCode = Math.abs(q.hashCode() % capacity);
            String[] bucket = stringsHashMap[bucketCode];
            Integer bucketCounter = countersHashMap[bucketCode];
            int occurCounter = 0;

            if (bucketCounter != null)
                for (int i = 0; i < bucketCounter; i++)
                    if (bucket[i].equals(q))
                        occurCounter++;

            r.add(occurCounter);
        }

        return r;
    }

}
