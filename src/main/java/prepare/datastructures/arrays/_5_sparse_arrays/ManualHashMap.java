package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.ArrayList;
import java.util.List;

public class ManualHashMap extends AbstractSolution {

    List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        String[][] stringsHashMap = new String[1000][];
        Integer[] countersHashMap = new Integer[1000];

        for (String s : stringList) {
            int bucketCode = Math.abs(s.hashCode() % 1000);

            if (stringsHashMap[bucketCode] == null) {
                stringsHashMap[bucketCode] = new String[50];
                countersHashMap[bucketCode] = 0;
            }

            stringsHashMap[bucketCode][countersHashMap[bucketCode]++] = s;
        }

        List<Integer> r = new ArrayList<>(1000);

        for (String q : queries) {
            int bucketCode = Math.abs(q.hashCode() % 1000);
            Integer bucketCounter = countersHashMap[bucketCode];
            int occurCounter = 0;

            if (bucketCounter != null)
                for (int i = 0; i < bucketCounter; i++)
                    if (stringsHashMap[bucketCode][i].equals(q))
                        occurCounter++;

            r.add(occurCounter);
        }

        return r;
    }

}
