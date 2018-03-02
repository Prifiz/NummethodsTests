package attribute.converters;

import attribute.Vector;
import attribute.VectorComponent;
import attribute.generators.FixedValueVectorGenerator;

import java.io.IOException;

public class PolarToCartesianConverter implements CoordinateSystemsConverter {

    @Override
    public Vector convert(Vector source) throws IOException {
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
}
