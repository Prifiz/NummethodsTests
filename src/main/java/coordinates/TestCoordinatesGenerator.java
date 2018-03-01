package coordinates;

import attribute.Vector;
import attribute.generators.RandomValueVectorGenerator;
import attribute.generators.VectorGenerationException;
import boundaries.Boundary;
import boundaries.Range;
import random.RandomGenerator;
import random.RandomUniformIntervalGenerator;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestCoordinatesGenerator implements CoordinatesGenerator {

    private Boundary boundary;

    public TestCoordinatesGenerator(Boundary boundary) {
        this.boundary = boundary;
    }

    @Override
    public Vector generate() throws VectorGenerationException {
        Map<String, RandomGenerator> randomGeneratorMap = new LinkedHashMap<>();
        for (int i = 0; i < this.boundary.getSize(); i++) {
            Range range = boundary.getRange(i);
            RandomGenerator randomGenerator = new RandomUniformIntervalGenerator(range.getMin(), range.getMax());
            randomGeneratorMap.put(range.getName(), randomGenerator);
        }
        return new RandomValueVectorGenerator(randomGeneratorMap).generateVector();
    }
}
