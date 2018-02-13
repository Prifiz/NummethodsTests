package random;

import coordinates.Coordinates2D;
import coordinates.Coordinates3D;

/**
 * Created by PrifizGamer on 12.02.2018.
 */
public interface PositionGenerator {
    Coordinates2D generate2DPoint();
    Coordinates3D generate3DPoint();
}
