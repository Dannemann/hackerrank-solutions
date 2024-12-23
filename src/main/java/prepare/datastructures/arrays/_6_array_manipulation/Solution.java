package prepare.datastructures.arrays._6_array_manipulation;

import java.util.List;

public class Solution extends AbstractSolution {

    long arrayManipulation(int n, List<List<Integer>> queries) {
        int[] array = new int[n];
        int biggest = 0;

        for (List<Integer> query : queries)
            for (int i = query.get(0) - 1; i < query.get(1); i++) {
                array[i] += query.get(2);
                biggest = Math.max(array[i], biggest);
            }

        return biggest;
    }

}
