package random;

import boundaries.Boundaries;

/**
 * Created by PrifizGamer on 13.02.2018.
 */
public abstract class AbstractAttributeGeneratorFactory implements PositionGenerator {
    private Boundaries boundaries;

    public AbstractAttributeGeneratorFactory(Boundaries boundaries) {
        this.boundaries = boundaries;
    }

}
