package attribute;

public class ZeroScalarGenerator implements ScalarGenerator {
    @Override
    public Scalar generateScalar() {
        return new ScalarImpl(0.0f);
    }
}
