package attribute.generators;

import attribute.Scalar;
import attribute.ScalarImpl;

public class FixedValueScalarGenerator implements ScalarGenerator {

    private double fixedValue;

    public FixedValueScalarGenerator(double fixedValue) {
        this.fixedValue = fixedValue;
    }

    @Override
    public Scalar generateScalar() {
        return new ScalarImpl(fixedValue);
    }
}
