package random;

import boundaries.Boundaries;
import coordinates.Coordinates2D;
import coordinates.Coordinates3D;

/**
 * Created by PrifizGamer on 13.02.2018.
 */
public class FixedAttributeGeneratorFactory extends AbstractAttributeGeneratorFactory {
    public FixedAttributeGeneratorFactory(Boundaries boundaries) {
        super(boundaries);
    }

    @Override
    public Coordinates2D generate2DPoint() {
        return null;
    }

    @Override
    public Coordinates3D generate3DPoint() {
        return null;
    }
}
