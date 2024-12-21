package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BigStringReplace extends AbstractSolution {

    List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        int sSize = stringList.size();
        String[] stringArray = stringList.toArray(new String[sSize]);

        stringList = null;
        System.gc();

        StringBuilder sb = new StringBuilder(";");

        for (int i = 0; i < sSize; i++) {
            sb.append(stringArray[i]).append(";");
            stringArray[i] = null;
        }

        stringArray = null;
        System.gc();

        Map<String, Integer> cache = new HashMap<>((int) (queries.size() / .75 + 1));

        return queries.stream().map(q -> {
            Integer counter = cache.get(q);

            if (counter != null)
                return counter;
            else {
                int qLen = q.length();
                String qSemicoloned = ";" + q + ";";
                int qSemicolonedLen = qSemicoloned.length();
                int lenBefore = sb.length();
                int index;

                while ((index = sb.indexOf(qSemicoloned)) != -1)
                    sb.replace(index, index + qSemicolonedLen, ";");

                int lenAfter = sb.length();
                int dif = lenBefore - lenAfter;
                int semicolons = dif / (qLen + 1);
                dif = dif - semicolons;
                int occurrences = dif > 0 ? dif / qLen : 0;

                cache.put(q, occurrences);
                return occurrences;
            }
        }).collect(Collectors.toList());
    }

}
