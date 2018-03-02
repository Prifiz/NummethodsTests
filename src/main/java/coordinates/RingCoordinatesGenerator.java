package coordinates;

import attribute.Vector;
import attribute.converters.PolarToCartesianConverter;
import attribute.generators.RandomValueVectorGenerator;
import boundaries.Boundary;
import boundaries.Range;
import random.RandomGenerator;
import random.RandomUniformIntervalGenerator;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class RingCoordinatesGenerator implements CoordinatesGenerator {

    private Boundary boundary;

    public RingCoordinatesGenerator(Boundary boundary) {
        this.boundary = boundary;
    }

    @Override
    public Vector generate() throws IOException {

        // fixme only random???

        Map<String, RandomGenerator> randomGeneratorMap = new LinkedHashMap<>();

        for(Range range : boundary.getSimpleRanges()) {
            randomGeneratorMap.put(
                    range.getName(),
                    new RandomUniformIntervalGenerator(range.getMin(), range.getMax()));
        }

        Vector source = new RandomValueVectorGenerator(randomGeneratorMap).generateVector();

        return new PolarToCartesianConverter().convert(source);
    }

    // TODO getDisplayName() analog for not to duplicate name strings everywhere!!!
}
