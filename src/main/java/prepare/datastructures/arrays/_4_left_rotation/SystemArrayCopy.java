package prepare.datastructures.arrays._4_left_rotation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SystemArrayCopy extends AbstractSolution {

    List<Integer> rotateLeft(int d, List<Integer> arr) {
        int[] ar = arr.stream().mapToInt(i -> i).toArray();

        int length = ar.length;
        int dif = length - d;
        int[] r = new int[length];

        System.arraycopy(ar, d, r, 0, dif);
        System.arraycopy(ar, 0, r, dif, d);

        return Arrays.stream(r).boxed().collect(Collectors.toUnmodifiableList());
    }

}
