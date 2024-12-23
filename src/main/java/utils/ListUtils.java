package utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static List<Integer> integerList(Integer... ints) {
        List<Integer> list = new ArrayList<>(ints.length);
        for (Integer i : ints)
            list.add(i);
        return list;
    }

}
