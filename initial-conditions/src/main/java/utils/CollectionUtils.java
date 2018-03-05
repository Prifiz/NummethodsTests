package utils;

import java.util.List;

public class CollectionUtils {
    public static double[] listToRawArray(List<Double> list, int expectedSize) throws IllegalArgumentException {
        final int LIST_SIZE = list.size();
        if(LIST_SIZE != expectedSize) {
            throw new IllegalArgumentException("List size doesn't equal to expected count!");
        } else {
            final double[] result = new double[LIST_SIZE];
            for (int i = 0; i < LIST_SIZE; i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }
}
