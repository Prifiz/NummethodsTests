package coordinates;

import attribute.Vector;
import attribute.VectorComponent;
import attribute.generators.FixedValueVectorGenerator;
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
        Map<String, RandomGenerator> randomGeneratorMap = new LinkedHashMap<>();

        for(Range range : boundary.getSimpleRanges()) {
            randomGeneratorMap.put(range.getName(), new RandomUniformIntervalGenerator(range.getMin(), range.getMax()));
        }

        Vector source = new RandomValueVectorGenerator(randomGeneratorMap).generateVector();

        double angle = source.getComponentByName("angle").getScalar().getValue();
        double radius = source.getComponentByName("radius").getScalar().getValue();

        return new FixedValueVectorGenerator(
                new VectorComponent(getX(angle, radius), "x"),
                new VectorComponent(getY(angle, radius), "y"))
                .generateVector();
    }

    private double getX(double angle, double radius) {
        return radius * Math.cos(angle);
    }

    private double getY(double angle, double radius) {
        return radius * Math.sin(angle);
    }

    // TODO convertToCartesianCoordinates() method
    // TODO getDisplayName() analog for not to duplicate name strings everywhere!!!
}
