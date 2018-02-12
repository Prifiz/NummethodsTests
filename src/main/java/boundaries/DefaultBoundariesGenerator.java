package boundaries;

/**
 * Created by PrifizGamer on 12.02.2018.
 */
public class DefaultBoundariesGenerator implements BoundariesGenerator {

    public Boundaries createBoundaries(AbstractBoundariesParams abstractBoundariesParams) {
        switch (abstractBoundariesParams.getName()) {
            case BoundariesNames.RECTANGLE_BOUNDARY: {
                return new RectangleBoundaries((RectangleBoundariesParams) abstractBoundariesParams);
            }
            default: {
                return null;
            }
        }
    }
}
