package prepare.datastructures.arrays._2_2d_array_ds;

import java.util.List;

class Solution extends AbstractSolution {

    int hourglassSum(List<List<Integer>> arr) {
        int biggest = -63;

        for (int i = 0; i < 4; i++) {
            List<Integer> row1 = arr.get(i);
            List<Integer> row2 = arr.get(i + 1);
            List<Integer> row3 = arr.get(i + 2);

            for (int j = 0; j < 4; j++) {
                int hgSum = row1.get(j) + row1.get(j + 1) + row1.get(j + 2) + row2.get(j + 1) + row3.get(j) + row3.get(j + 1) + row3.get(j + 2);

                if (hgSum > biggest)
                    biggest = hgSum;
            }
        }

        return biggest;
    }

}
