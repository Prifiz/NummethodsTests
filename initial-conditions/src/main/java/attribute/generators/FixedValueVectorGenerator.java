package attribute.generators;

import attribute.Vector;
import attribute.VectorComponent;
import attribute.VectorImpl;

public class FixedValueVectorGenerator implements VectorGenerator {

    private VectorComponent[] components;

    public FixedValueVectorGenerator(double... components) {
        this.components = new VectorComponent[components.length];
        for (int i = 0; i < components.length; i++) {
            this.components[i] = new VectorComponent(
                    new FixedValueScalarGenerator(components[i]).generateScalar(),
                    "");
        }
    }

    public FixedValueVectorGenerator(VectorComponent... components) {
        this.components = components;
    }

    @Override
    public Vector generateVector() throws VectorGenerationException {
        return new VectorImpl(components);
    }
}
