package coordinates;

import boundaries.Boundaries;
import random.PositionGenerator;
import random.RandomGenerator;

/**
 * Created by PrifizGamer on 12.02.2018.
 */
public interface CoordinatesGenerator {
    Coordinates2D generateCoordinates(PositionGenerator positionGenerator, Boundaries boundaries);
}
