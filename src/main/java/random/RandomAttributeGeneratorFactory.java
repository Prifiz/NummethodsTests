package random;

import boundaries.Boundaries;
import coordinates.Coordinates2D;
import coordinates.Coordinates3D;

/**
 * Created by PrifizGamer on 13.02.2018.
 */
public class RandomAttributeGeneratorFactory extends AbstractAttributeGeneratorFactory {

    public RandomAttributeGeneratorFactory(Boundaries boundaries) {
        super(boundaries);
    }

    @Override
    public Coordinates2D generate2DPoint() {
        double x;
        double y;
        RandomGenerator randomGenerator = new RandomUniformIntervalGenerator()
        return null;
    }

    @Override
    public Coordinates3D generate3DPoint() {
        return null;
    }
}
