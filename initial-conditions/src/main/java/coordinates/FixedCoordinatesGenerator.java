package coordinates;

import attribute.Vector;
import attribute.generators.VectorGenerationException;
import attribute.generators.VectorGenerator;

/**
 * Created by PrifizGamer on 27.02.2018.
 */
public class FixedCoordinatesGenerator implements CoordinatesGenerator {

    private VectorGenerator vectorGenerator;

    public FixedCoordinatesGenerator(VectorGenerator vectorGenerator) {
        this.vectorGenerator = vectorGenerator;
    }

    @Override
    public Vector generate() throws VectorGenerationException {
        return vectorGenerator.generateVector();
    }
}
