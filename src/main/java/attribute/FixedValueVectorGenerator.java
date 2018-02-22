package attribute;

public class FixedValueVectorGenerator implements VectorGenerator {

    private double[] components;

    public FixedValueVectorGenerator(double... components) {
        this.components = components;
    }

    @Override
    public Vector generateVector() throws VectorGenerationException {
        Scalar[] scalars = new Scalar[components.length];
        for (int i = 0; i < scalars.length; i++) {
            scalars[i] = new FixedValueScalarGenerator(components[i]).generateScalar();
        }
        return new VectorImpl(scalars);
    }
}
