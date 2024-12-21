package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigStringReplaceLoL extends AbstractSolution {

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

        int qSize = queries.size();
        Map<String, Integer> cache = new HashMap<>((int) (qSize / .75 + 1));
        List<Integer> r = new ArrayList<>(qSize);

        for (String q : queries) {
            Integer counter = cache.get(q);

            if (counter != null)
                r.add(counter);
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

                r.add(occurrences);
                cache.put(q, occurrences);
            }
        }

        return r;
    }

}
