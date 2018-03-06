package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtils {
    public static double roundResult (double fullValue, int precise) {
        return new BigDecimal(fullValue).setScale(precise, RoundingMode.UP).doubleValue();
    }
}
