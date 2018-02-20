package attribute;

/**
 * Created by PrifizGamer on 16.02.2018.
 */
public class FixedValueScalar extends Scalar {

    public FixedValueScalar(double value) {
        super(value);
    }

    @Override
    public double getValue() {
        return value;
    }
}
