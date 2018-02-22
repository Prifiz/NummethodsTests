package attribute;

public class ZeroVectorGenerator implements VectorGenerator {

    private int size;

    public ZeroVectorGenerator(int size) {
        this.size = size;
    }

    @Override
    public Vector generateVector() throws VectorGenerationException {
        Scalar[] scalars = new Scalar[size];
        for (int i = 0; i < size; i++) {
            scalars[i] = new ZeroScalarGenerator().generateScalar();
        }
        return new VectorImpl(scalars);
    }
}
