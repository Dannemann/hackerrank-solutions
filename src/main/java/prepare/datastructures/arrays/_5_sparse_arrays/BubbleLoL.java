package prepare.datastructures.arrays._5_sparse_arrays;

import java.util.ArrayList;
import java.util.List;

public class BubbleLoL extends AbstractSolution {

    List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> r = new ArrayList<>(queries.size());

        for (String q : queries) {
            int counter = 0;

            for (String s : stringList)
                if (s.equals(q))
                    counter++;

            r.add(counter);
        }

        return r;
    }

}
